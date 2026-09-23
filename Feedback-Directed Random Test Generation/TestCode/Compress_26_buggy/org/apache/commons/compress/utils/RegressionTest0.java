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
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.compress.utils.IOUtils.toByteArray(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = new byte[] {};
        int int2 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.Closeable closeable0 = null;
        org.apache.commons.compress.utils.IOUtils.closeQuietly(closeable0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass8 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.InputStream inputStream0 = null;
        long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.InputStream inputStream0 = null;
        long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1 });
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) '4');
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
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.InputStream inputStream0 = null;
        long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) '#');
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
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10 });
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4);
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        byte[] byteArray7 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray7);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray7);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray7);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray7);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray7);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray7, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8);
        java.lang.Class<?> wildcardClass17 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray6 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray6);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray6);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray6);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray6);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray6);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray6);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray6 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray6);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray6);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray6);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray6);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray6, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3);
        java.lang.Class<?> wildcardClass7 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4);
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4);
        java.lang.Class<?> wildcardClass9 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4);
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4);
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.InputStream inputStream0 = null;
        long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, 1);
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
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4);
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray6 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray6);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray6);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray6);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray6);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray6, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5);
        java.lang.Class<?> wildcardClass11 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9);
        java.lang.Class<?> wildcardClass19 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.InputStream inputStream0 = null;
        long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.io.InputStream inputStream0 = null;
        long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        byte[] byteArray7 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray7);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray7);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray7);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray7);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray7);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray7);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray7);
        java.lang.Class<?> wildcardClass15 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, (int) (short) 0, 0);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8);
        java.lang.Class<?> wildcardClass19 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (short) 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9);
        java.lang.Class<?> wildcardClass21 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, (int) (short) 10, (int) '4');
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
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (short) 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1);
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
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.InputStream inputStream0 = null;
        long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        byte[] byteArray7 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray7);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray7);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray7);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray7);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray7);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray7);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray7, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass17 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (short) 0, 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        byte[] byteArray7 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray7);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray7);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray7);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray7);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray7);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray7);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray7, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        byte[] byteArray7 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray7);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray7);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray7);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray7);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray7);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray7, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        byte[] byteArray7 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray7);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray7);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray7);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray7);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray7);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray7, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        byte[] byteArray7 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray7);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray7);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray7);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray7);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray7);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray7, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray6, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) -1 });
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        byte[] byteArray7 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray7);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray7);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray7);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray7);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray7);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray7, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (short) 0, 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, 10);
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
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (short) 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (short) 0, 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10);
        java.lang.Class<?> wildcardClass23 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4);
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, (int) (short) 0, 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, (int) (short) 0, 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0 });
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4);
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, 0, 0);
        java.lang.Class<?> wildcardClass5 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, (int) (short) 0, 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, (int) (short) 0, 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, (int) (short) 0, 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass29 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13);
        java.lang.Class<?> wildcardClass29 = byteArray13.getClass();
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, (int) (short) 0, 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11);
        java.lang.Class<?> wildcardClass25 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, (int) (byte) 0, (int) (byte) 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 100, (byte) 1 });
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, (int) (short) 0, 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12);
        java.lang.Class<?> wildcardClass27 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, (int) (short) 0, 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (short) 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3, 0, 0);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (short) 0, 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.io.InputStream inputStream0 = null;
        long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, (int) (short) 0, 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4, 0, 0);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        byte[] byteArray7 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray7);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray7);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray7);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray7);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray7);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray7);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray7, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (short) 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (short) 0, 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (byte) 0, (int) (byte) 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14, (int) (short) 0, 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14);
        java.lang.Class<?> wildcardClass31 = byteArray14.getClass();
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4);
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9, 0, (int) (byte) 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9);
        java.lang.Class<?> wildcardClass23 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray2 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1 });
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3, 0, 0);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, 0, 0);
        java.lang.Class<?> wildcardClass11 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (byte) 0, (int) (byte) 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10, 0, (int) (byte) 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (byte) 0, (int) (byte) 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3, 0, 0);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (short) 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (byte) 0, (int) (byte) 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.utils.IOUtils.copy(inputStream0, outputStream1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10);
        java.lang.Class<?> wildcardClass21 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11);
        java.lang.Class<?> wildcardClass23 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (short) 0, 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (byte) 0, (int) (byte) 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9);
        java.lang.Class<?> wildcardClass21 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13, (int) (byte) 0, 0);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13);
        java.lang.Class<?> wildcardClass31 = byteArray13.getClass();
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (short) 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.utils.IOUtils.skip(inputStream0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, (int) (short) 0, 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14, (int) (short) 0, 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (short) 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, (int) (short) 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12);
        java.lang.Class<?> wildcardClass25 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11);
        java.lang.Class<?> wildcardClass25 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14, (int) (short) 0, 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14, (int) (byte) 0, 0);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14, (int) (short) 0, 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, (int) (short) 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray6 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray6);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray6);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray6);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray6);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray6, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (byte) 0, (int) (byte) 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10);
        java.lang.Class<?> wildcardClass23 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4, 0, 0);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray6 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray6);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray6);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray6);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray6);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray6, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3);
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3, 0, 0);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3);
        java.lang.Class<?> wildcardClass9 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (short) 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4);
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (byte) 0, (int) (byte) 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (byte) 0, (int) (byte) 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10, 0, (int) (byte) 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14, (int) (byte) 0, (int) (byte) 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, (int) (byte) 0, (int) (byte) 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12, 0, (int) (byte) 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (byte) 0, (int) (byte) 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (byte) 0, (int) (byte) 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, (int) (byte) 0, (int) (byte) 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11, 0, (int) (byte) 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11);
        java.lang.Class<?> wildcardClass27 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (byte) 0, (int) (byte) 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13);
        java.lang.Class<?> wildcardClass29 = byteArray13.getClass();
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14, (int) (byte) 0, (int) (byte) 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14, (int) (short) 0, 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14, (int) (byte) 0, 0);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, (int) (short) 0, 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14, (int) (short) 0, 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, (int) (short) 0, 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (byte) 0, (int) (byte) 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10, 0, (int) (byte) 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10);
        java.lang.Class<?> wildcardClass25 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14, (int) (short) 0, 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14, (int) (byte) 0, 0);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14);
        java.lang.Class<?> wildcardClass33 = byteArray14.getClass();
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, (int) (byte) 0, (int) (byte) 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4, 0, 0);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (byte) 0, (int) (byte) 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4, 0, 0);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray18 = new byte[] {};
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray18);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray18);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray18);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray18);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray18);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray18);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray18, (int) (short) 0, 0);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray18);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray18);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray18);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray18);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray18, (int) (byte) 0, 0);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray18);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray18);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray18);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray18);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray18, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, (int) (short) 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (byte) 0, (int) (byte) 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13, 0, (int) (byte) 0);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        byte[] byteArray17 = new byte[] {};
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray17);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray17);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray17);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray17);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray17);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray17);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray17, (int) (short) 0, 0);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray17);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray17);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray17);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray17);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray17, (int) (byte) 0, 0);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray17);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray17);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray17);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray17);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray17);
        java.lang.Class<?> wildcardClass39 = byteArray17.getClass();
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, (int) (short) 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, (int) (byte) 0, (int) (byte) 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12, 0, (int) (byte) 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12);
        java.lang.Class<?> wildcardClass29 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, (int) (short) 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, (int) (short) 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15, (int) (byte) 0, 0);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15);
        java.lang.Class<?> wildcardClass35 = byteArray15.getClass();
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4, 0, 0);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5, 0, 0);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5);
        java.lang.Class<?> wildcardClass13 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, (int) (short) 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3, 0, 0);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray6 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray6, 0, 0);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray6);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray6);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray6);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray6, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14, (int) (short) 0, 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, (int) (byte) 0, (int) (byte) 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12, 0, (int) (byte) 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        byte[] byteArray11 = new byte[] {};
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray11);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray11);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray11);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray11);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray11);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray11);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray11, (int) (byte) 0, (int) (byte) 0);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray11);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray11);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray11, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray16);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray16);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray16);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray16);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray16);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray16);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray16, (int) (short) 0, 0);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray16);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray16);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray16);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray16);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray16, (int) (byte) 0, 0);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray16);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray16);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray16);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray16);
        java.lang.Class<?> wildcardClass37 = byteArray16.getClass();
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        byte[] byteArray17 = new byte[] {};
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray17);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray17);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray17);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray17);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray17);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray17);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray17, (int) (short) 0, 0);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray17);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray17);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray17);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray17);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray17, (int) (byte) 0, 0);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray17);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray17);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray17);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray17, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4, 0, 0);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4, 0, 0);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, (int) (short) 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4, 0, 0);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9, (int) (short) 0, 0);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5, 0, 0);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, (int) (short) 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        byte[] byteArray14 = new byte[] {};
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray14);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray14);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray14);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray14);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray14);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray14);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray14, (int) (short) 0, 0);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray14);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray14);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray14);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray14);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray14, (int) (byte) 0, 0);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray14, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        byte[] byteArray3 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray3, 0, 0);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray3, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (byte) 0, (int) (byte) 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (short) 0, 0);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        byte[] byteArray16 = new byte[] {};
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray16);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray16);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray16);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray16);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray16);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray16);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray16, (int) (short) 0, 0);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray16);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray16);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray16);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray16);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray16, (int) (byte) 0, 0);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray16);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray16);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray16, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, 0, (int) (short) 0);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4);
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        byte[] byteArray6 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray6, 0, 0);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray6);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray6);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray6);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray6);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray6);
        java.lang.Class<?> wildcardClass15 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int5 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5, 0, 0);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5, 0, 0);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, (int) (short) 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        byte[] byteArray12 = new byte[] {};
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray12);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray12);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray12);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray12);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray12);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray12);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray12, (int) (byte) 0, (int) (byte) 0);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray12);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray12);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray12);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray12);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray12);
        java.lang.Class<?> wildcardClass27 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        byte[] byteArray15 = new byte[] {};
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray15);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray15);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray15);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray15);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray15);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray15, (int) (short) 0, 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray15);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray15);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray15);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray15);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray15);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray15);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray15);
        int int32 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray15);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        java.io.InputStream inputStream17 = null;
        byte[] byteArray18 = new byte[] {};
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream17, byteArray18);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray18);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray18);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray18);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray18);
        int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray18);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray18, (int) (short) 0, 0);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray18);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray18);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray18);
        int int31 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray18);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray18, (int) (byte) 0, 0);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray18);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray18);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray18);
        int int38 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray18);
        int int39 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray18, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        byte[] byteArray5 = new byte[] {};
        int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray5);
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray5);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray5);
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray5, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        byte[] byteArray8 = new byte[] {};
        int int9 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray8);
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray8);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray8);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray8);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray8);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray8);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray8, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray8, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        byte[] byteArray4 = new byte[] {};
        int int7 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray4, 0, 0);
        int int8 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray4);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray4, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray4, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        byte[] byteArray10 = new byte[] {};
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray10);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray10);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray10);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray10);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray10);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray10);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray10, (int) (short) 0, 0);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray10);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray10, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        byte[] byteArray13 = new byte[] {};
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray13);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray13);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray13);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray13);
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray13);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray13);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray13, (int) (byte) 0, (int) (byte) 0);
        int int25 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray13, 0, (int) (byte) 0);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray13);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray13);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray13);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray13);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray13);
        java.lang.Class<?> wildcardClass31 = byteArray13.getClass();
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        byte[] byteArray2 = new byte[] {};
        int int3 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray2, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        byte[] byteArray9 = new byte[] {};
        int int10 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray9);
        int int11 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray9);
        int int12 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray9);
        int int13 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray9);
        int int14 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray9);
        int int15 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray9);
        int int16 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray9);
        int int17 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray9, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        java.io.InputStream inputStream2 = null;
        java.io.InputStream inputStream3 = null;
        java.io.InputStream inputStream4 = null;
        java.io.InputStream inputStream5 = null;
        java.io.InputStream inputStream6 = null;
        java.io.InputStream inputStream7 = null;
        java.io.InputStream inputStream8 = null;
        java.io.InputStream inputStream9 = null;
        java.io.InputStream inputStream10 = null;
        java.io.InputStream inputStream11 = null;
        java.io.InputStream inputStream12 = null;
        java.io.InputStream inputStream13 = null;
        java.io.InputStream inputStream14 = null;
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream16 = null;
        byte[] byteArray17 = new byte[] {};
        int int18 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream16, byteArray17);
        int int19 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream15, byteArray17);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream14, byteArray17);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream13, byteArray17);
        int int22 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream12, byteArray17);
        int int23 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream11, byteArray17);
        int int26 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream10, byteArray17, (int) (short) 0, 0);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream9, byteArray17);
        int int28 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream8, byteArray17);
        int int29 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream7, byteArray17);
        int int30 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream6, byteArray17);
        int int33 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream5, byteArray17, (int) (byte) 0, 0);
        int int34 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream4, byteArray17);
        int int35 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream3, byteArray17);
        int int36 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream2, byteArray17);
        int int37 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream1, byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray17, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.compress.utils.IOUtils.readFully(inputStream0, byteArray1, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }
}

