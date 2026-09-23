package org.apache.commons.compress.archivers.tar;

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
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = tarArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        java.io.Reader reader17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap18 = tarArchiveInputStream1.parsePaxHeaders(reader17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = tarArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap9 = tarArchiveInputStream1.parsePaxHeaders(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveInputStream1.canReadEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveInputStream1.buffer;
        java.lang.Class<?> wildcardClass6 = tarBuffer5.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream1.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = tarArchiveInputStream1.getCurrentEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        long long7 = tarArchiveInputStream1.skip((long) (short) 10);
        tarArchiveInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = tarArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = tarArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        int int3 = tarArchiveInputStream1.getCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        int int6 = tarArchiveInputStream1.getCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        int int17 = tarArchiveInputStream1.available();
        tarArchiveInputStream1.reset();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveInputStream1.buffer;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(tarBuffer19);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        long long7 = tarArchiveInputStream1.skip((long) (short) 10);
        java.lang.Class<?> wildcardClass8 = tarArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap8 = tarArchiveInputStream1.parsePaxHeaders(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        boolean boolean8 = tarArchiveInputStream1.isAtEOF();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveInputStream1.buffer;
        int int18 = tarArchiveInputStream1.getRecordSize();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 512 + "'", int18 == 512);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        int int17 = tarArchiveInputStream1.available();
        tarArchiveInputStream1.reset();
        boolean boolean19 = tarArchiveInputStream1.markSupported();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveInputStream1.buffer;
        int int7 = tarArchiveInputStream1.read();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap9 = tarArchiveInputStream1.parsePaxHeaders(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        java.io.Reader reader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap6 = tarArchiveInputStream1.parsePaxHeaders(reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = null;
        tarArchiveInputStream1.setCurrentEntry(tarArchiveEntry2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        tarArchiveInputStream1.mark((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveInputStream1.buffer;
        int int18 = tarArchiveInputStream1.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (byte) 10);
        int int21 = tarArchiveInputStream1.read();
        java.io.Reader reader22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap23 = tarArchiveInputStream1.parsePaxHeaders(reader22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream8);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int14 = tarArchiveInputStream9.read(byteArray13);
        int int17 = tarArchiveInputStream1.read(byteArray13, 1, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveInputStream1.buffer;
        tarArchiveInputStream1.reset();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveInputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer21 = tarArchiveInputStream1.buffer;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer18);
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertNotNull(tarBuffer21);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveInputStream1.canReadEntryData(archiveEntry3);
        java.lang.Class<?> wildcardClass5 = tarArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveInputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = tarArchiveInputStream1.canReadEntryData(archiveEntry7);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = tarArchiveInputStream1.canReadEntryData(archiveEntry9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveInputStream1.canReadEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveInputStream1.buffer;
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream6);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int12 = tarArchiveInputStream7.read(byteArray11);
        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean21 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray19, (int) 'a');
        int int22 = tarArchiveInputStream7.read(byteArray19);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer23 = tarArchiveInputStream7.buffer;
        int int24 = tarArchiveInputStream7.read();
        byte[] byteArray31 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean33 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray31, (int) 'a');
        int int34 = tarArchiveInputStream7.read(byteArray31);
        int int35 = tarArchiveInputStream1.read(byteArray31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveInputStream1.buffer;
        int int18 = tarArchiveInputStream1.read();
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray25, (int) 'a');
        int int28 = tarArchiveInputStream1.read(byteArray25);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream29 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveInputStream1.buffer;
        int int3 = tarArchiveInputStream1.getCount();
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (byte) 10, (-1));
        int int6 = tarArchiveInputStream5.getRecordSize();
        tarArchiveInputStream5.mark((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        long long7 = tarArchiveInputStream1.skip((long) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 0, (int) (short) -1);
        long long11 = tarArchiveInputStream1.getBytesRead();
        long long13 = tarArchiveInputStream1.skip((long) (short) 100);
        java.lang.Class<?> wildcardClass14 = tarArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        tarArchiveInputStream1.setAtEOF(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        tarArchiveInputStream1.reset();
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        long long7 = tarArchiveInputStream1.skip((long) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 0, (int) (short) -1);
        boolean boolean11 = tarArchiveInputStream10.isAtEOF();
        java.lang.Class<?> wildcardClass12 = tarArchiveInputStream10.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1);
        int int7 = tarArchiveInputStream1.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = tarArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveInputStream1.buffer;
        int int18 = tarArchiveInputStream1.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream20, (int) (byte) 0, (int) (byte) 1);
        long long24 = tarArchiveInputStream20.getBytesRead();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveInputStream1.buffer;
        boolean boolean9 = tarArchiveInputStream1.isAtEOF();
        tarArchiveInputStream1.mark(0);
        tarArchiveInputStream1.mark((int) '#');
        int int14 = tarArchiveInputStream1.read();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        long long7 = tarArchiveInputStream1.skip((long) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 0, (int) (short) -1);
        long long11 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream8);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int14 = tarArchiveInputStream9.read(byteArray13);
        int int17 = tarArchiveInputStream1.read(byteArray13, 1, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveInputStream1.buffer;
        int int19 = tarArchiveInputStream1.read();
        long long21 = tarArchiveInputStream1.skip((long) (short) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = null;
        boolean boolean18 = tarArchiveInputStream1.canReadEntryData(archiveEntry17);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveInputStream1.buffer;
        int int18 = tarArchiveInputStream1.read();
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray25, (int) 'a');
        int int28 = tarArchiveInputStream1.read(byteArray25);
        int int29 = tarArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry30 = tarArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1);
        long long7 = tarArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        tarArchiveInputStream1.setAtEOF(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = tarArchiveInputStream1.canReadEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = tarArchiveInputStream1.getCurrentEntry();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream11);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int17 = tarArchiveInputStream12.read(byteArray16);
        int int18 = tarArchiveInputStream12.getCount();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream19);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int25 = tarArchiveInputStream20.read(byteArray24);
        int int28 = tarArchiveInputStream12.read(byteArray24, 1, (int) (short) 1);
        int int29 = tarArchiveInputStream1.read(byteArray24);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(tarArchiveEntry10);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveInputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveInputStream1.canReadEntryData(archiveEntry3);
        int int5 = tarArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveInputStream1.canReadEntryData(archiveEntry6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = tarArchiveInputStream1.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream6, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream6, 10);
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.String> strMap10 = tarArchiveInputStream8.parsePaxHeaders(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveInputStream1.buffer;
        int int18 = tarArchiveInputStream1.read();
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean27 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray25, (int) 'a');
        int int28 = tarArchiveInputStream1.read(byteArray25);
        int int29 = tarArchiveInputStream1.getRecordSize();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 512 + "'", int29 == 512);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer2 = tarArchiveInputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveInputStream1.canReadEntryData(archiveEntry3);
        int int5 = tarArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = tarArchiveInputStream1.canReadEntryData(archiveEntry6);
        int int8 = tarArchiveInputStream1.available();
        org.junit.Assert.assertNotNull(tarBuffer2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        long long7 = tarArchiveInputStream1.skip((long) (short) 10);
        boolean boolean8 = tarArchiveInputStream1.isAtEOF();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = tarArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        long long7 = tarArchiveInputStream1.skip((long) (short) 10);
        tarArchiveInputStream1.close();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        int int16 = tarArchiveInputStream1.read(byteArray13, (int) (short) 10, (int) (short) 10);
        boolean boolean17 = tarArchiveInputStream1.markSupported();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveInputStream1.buffer;
        int int18 = tarArchiveInputStream1.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream20, (int) (byte) 0, (int) (byte) 1);
        tarArchiveInputStream23.reset();
        boolean boolean25 = tarArchiveInputStream23.isAtEOF();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        tarArchiveInputStream1.setAtEOF(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveInputStream1.buffer;
        tarArchiveInputStream1.close();
        tarArchiveInputStream1.close();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer19);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray6, (int) 'a');
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray6, 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        tarArchiveInputStream5.close();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveInputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = tarArchiveInputStream1.canReadEntryData(archiveEntry7);
        int int9 = tarArchiveInputStream1.getRecordSize();
        int int10 = tarArchiveInputStream1.getCount();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveInputStream1.buffer;
        boolean boolean7 = tarArchiveInputStream1.isAtEOF();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveInputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = tarArchiveInputStream1.canReadEntryData(archiveEntry7);
        int int9 = tarArchiveInputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        tarArchiveInputStream1.setAtEOF(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = tarArchiveInputStream1.canReadEntryData(archiveEntry8);
        tarArchiveInputStream1.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = tarArchiveInputStream1.getCurrentEntry();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(tarArchiveEntry11);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveInputStream1.buffer;
        boolean boolean9 = tarArchiveInputStream1.isAtEOF();
        tarArchiveInputStream1.mark(0);
        tarArchiveInputStream1.setAtEOF(false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveInputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = tarArchiveInputStream1.canReadEntryData(archiveEntry7);
        int int9 = tarArchiveInputStream1.getRecordSize();
        int int10 = tarArchiveInputStream1.read();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        tarArchiveInputStream1.mark((int) (byte) -1);
        tarArchiveInputStream1.reset();
        int int5 = tarArchiveInputStream1.read();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        tarArchiveInputStream1.setAtEOF(true);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = null;
        boolean boolean9 = tarArchiveInputStream1.canReadEntryData(archiveEntry8);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = tarArchiveInputStream1.getCurrentEntry();
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        int int20 = tarArchiveInputStream1.read(byteArray17, (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(tarArchiveEntry10);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveInputStream1.buffer;
        boolean boolean9 = tarArchiveInputStream1.isAtEOF();
        tarArchiveInputStream1.mark(0);
        tarArchiveInputStream1.mark((int) '#');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = tarArchiveInputStream1.getCurrentEntry();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(tarArchiveEntry14);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = tarArchiveInputStream1.canReadEntryData(archiveEntry9);
        boolean boolean11 = tarArchiveInputStream1.isAtEOF();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        int int6 = tarArchiveInputStream5.getRecordSize();
        tarArchiveInputStream5.close();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream8);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int14 = tarArchiveInputStream9.read(byteArray13);
        int int17 = tarArchiveInputStream1.read(byteArray13, 1, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveInputStream1.buffer;
        tarArchiveInputStream1.reset();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveInputStream1.buffer;
        int int21 = tarArchiveInputStream1.read();
        int int22 = tarArchiveInputStream1.getRecordSize();
        tarArchiveInputStream1.mark(0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer18);
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 512 + "'", int22 == 512);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        tarArchiveInputStream1.setAtEOF(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveInputStream1.buffer;
        tarArchiveInputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 0, 1);
        boolean boolean24 = tarArchiveInputStream23.markSupported();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        long long7 = tarArchiveInputStream1.skip((long) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 0, (int) (short) -1);
        long long11 = tarArchiveInputStream1.getBytesRead();
        long long13 = tarArchiveInputStream1.skip((long) (short) 100);
        boolean boolean14 = tarArchiveInputStream1.isAtEOF();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream6, 10);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = tarArchiveInputStream6.getNextEntry();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNull(archiveEntry9);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = null;
        tarArchiveInputStream1.setCurrentEntry(tarArchiveEntry6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveInputStream1.canReadEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveInputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1);
        tarArchiveInputStream1.mark((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tarBuffer5);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        tarArchiveInputStream1.setAtEOF(true);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer19 = tarArchiveInputStream1.buffer;
        tarArchiveInputStream1.close();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 0, 1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream23, (int) '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer19);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer17 = tarArchiveInputStream1.buffer;
        int int18 = tarArchiveInputStream1.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (byte) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream20, (int) (byte) 0, (int) (byte) 1);
        tarArchiveInputStream20.mark((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream7);
        long long9 = tarArchiveInputStream8.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = tarArchiveInputStream8.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream8, (int) (short) 10);
        long long14 = tarArchiveInputStream8.skip((long) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream8, (int) (short) 0, (int) (short) -1);
        long long18 = tarArchiveInputStream8.getBytesRead();
        int int19 = tarArchiveInputStream8.getRecordSize();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream20);
        long long22 = tarArchiveInputStream21.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = tarArchiveInputStream21.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream21, (int) (short) 10);
        long long27 = tarArchiveInputStream21.skip((long) (short) 10);
        tarArchiveInputStream21.close();
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        int int36 = tarArchiveInputStream21.read(byteArray33, (int) (short) 10, (int) (short) 10);
        int int37 = tarArchiveInputStream8.read(byteArray33);
        boolean boolean39 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray33, (int) (byte) 100);
        int int40 = tarArchiveInputStream5.read(byteArray33);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        int int17 = tarArchiveInputStream1.available();
        tarArchiveInputStream1.close();
        int int19 = tarArchiveInputStream1.read();
        tarArchiveInputStream1.close();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream8);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int14 = tarArchiveInputStream9.read(byteArray13);
        int int17 = tarArchiveInputStream1.read(byteArray13, 1, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer18 = tarArchiveInputStream1.buffer;
        tarArchiveInputStream1.reset();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer20 = tarArchiveInputStream1.buffer;
        int int21 = tarArchiveInputStream1.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = tarArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(tarBuffer18);
        org.junit.Assert.assertNotNull(tarBuffer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer9 = tarArchiveInputStream1.buffer;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = tarArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry8);
        org.junit.Assert.assertNotNull(tarBuffer9);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveInputStream1.buffer;
        int int7 = tarArchiveInputStream1.read();
        tarArchiveInputStream1.mark(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = tarArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: input buffer is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer6 = tarArchiveInputStream1.buffer;
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = tarArchiveInputStream1.canReadEntryData(archiveEntry7);
        int int9 = tarArchiveInputStream1.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(tarBuffer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveInputStream1.buffer;
        boolean boolean9 = tarArchiveInputStream1.isAtEOF();
        tarArchiveInputStream1.mark(0);
        long long12 = tarArchiveInputStream1.getBytesRead();
        long long13 = tarArchiveInputStream1.getBytesRead();
        boolean boolean14 = tarArchiveInputStream1.markSupported();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        int int5 = tarArchiveInputStream1.available();
        long long6 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream1.getCurrentEntry();
        tarArchiveInputStream1.setAtEOF(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry7);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        int int7 = tarArchiveInputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer8 = tarArchiveInputStream1.buffer;
        int int9 = tarArchiveInputStream1.read();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(tarBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        boolean boolean4 = tarArchiveInputStream1.isAtEOF();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        byte[] byteArray0 = new byte[] {};
        boolean boolean2 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray0, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        long long7 = tarArchiveInputStream1.skip((long) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 0, (int) (short) -1);
        long long11 = tarArchiveInputStream1.getBytesRead();
        int int12 = tarArchiveInputStream1.getRecordSize();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream13);
        long long15 = tarArchiveInputStream14.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = tarArchiveInputStream14.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream14, (int) (short) 10);
        long long20 = tarArchiveInputStream14.skip((long) (short) 10);
        tarArchiveInputStream14.close();
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1 };
        int int29 = tarArchiveInputStream14.read(byteArray26, (int) (short) 10, (int) (short) 10);
        int int30 = tarArchiveInputStream1.read(byteArray26);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry31 = null;
        tarArchiveInputStream1.setCurrentEntry(tarArchiveEntry31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        long long7 = tarArchiveInputStream1.skip((long) (short) 10);
        tarArchiveInputStream1.reset();
        long long9 = tarArchiveInputStream1.getBytesRead();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        boolean boolean4 = tarArchiveInputStream1.canReadEntryData(archiveEntry3);
        org.apache.commons.compress.archivers.tar.TarBuffer tarBuffer5 = tarArchiveInputStream1.buffer;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = tarArchiveInputStream6.getNextEntry();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tarBuffer5);
        org.junit.Assert.assertNull(archiveEntry7);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        int int6 = tarArchiveInputStream1.read(byteArray5);
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray13, (int) 'a');
        int int16 = tarArchiveInputStream1.read(byteArray13);
        int int17 = tarArchiveInputStream1.available();
        tarArchiveInputStream1.close();
        java.lang.Class<?> wildcardClass19 = tarArchiveInputStream1.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream1 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        long long2 = tarArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = tarArchiveInputStream1.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 10);
        long long7 = tarArchiveInputStream1.skip((long) (short) 10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream1, (int) (short) 0, (int) (short) -1);
        long long11 = tarArchiveInputStream1.getBytesRead();
        int int12 = tarArchiveInputStream1.getRecordSize();
        java.lang.Class<?> wildcardClass13 = tarArchiveInputStream1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

