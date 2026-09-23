package org.apache.commons.compress.archivers.sevenz;

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
        org.apache.commons.compress.archivers.sevenz.Coder coder1 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream9 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(inputStream0, coder1, byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod1 = null;
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream8 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(outputStream0, sevenZMethod1, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unsupported compression method null");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder lZMADecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder2 = null;
        byte[] byteArray3 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream4 = lZMADecoder0.decode(inputStream1, coder2, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.OutputStream outputStream1 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream8 = aES256SHA256Decoder0.encode(outputStream1, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: method doesn't support writing");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder lZMADecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream10 = aES256SHA256Decoder1.decode(inputStream2, coder3, byteArray9);
        org.apache.commons.compress.archivers.sevenz.Coder coder11 = null;
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream18 = lZMADecoder0.decode(inputStream2, coder11, byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder lZMADecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream11 = aES256SHA256Decoder2.decode(inputStream3, coder4, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream12 = lZMADecoder0.encode(outputStream1, byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: method doesn't support writing");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream11);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.compress.archivers.sevenz.Coders coders0 = new org.apache.commons.compress.archivers.sevenz.Coders();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder lZMADecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream10 = aES256SHA256Decoder1.decode(inputStream2, coder3, byteArray9);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder11 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder13 = null;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream20 = aES256SHA256Decoder11.decode(inputStream12, coder13, byteArray19);
        org.apache.commons.compress.archivers.sevenz.Coder coder21 = null;
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream26 = aES256SHA256Decoder1.decode(inputStream20, coder21, byteArray25);
        org.apache.commons.compress.archivers.sevenz.Coder coder27 = null;
        byte[] byteArray28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream29 = lZMADecoder0.decode(inputStream20, coder27, byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream26);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder2 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream9 = aES256SHA256Decoder0.decode(inputStream1, coder2, byteArray8);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder10 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder12 = null;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream19 = aES256SHA256Decoder10.decode(inputStream11, coder12, byteArray18);
        org.apache.commons.compress.archivers.sevenz.Coder coder20 = null;
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream25 = aES256SHA256Decoder0.decode(inputStream19, coder20, byteArray24);
        java.lang.Class<?> wildcardClass26 = byteArray24.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId0 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderIdArray1 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] { coderId0 };
        org.apache.commons.compress.archivers.sevenz.Coders.coderTable = coderIdArray1;
        org.junit.Assert.assertNotNull(coderIdArray1);
        org.junit.Assert.assertArrayEquals(coderIdArray1, new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] { null });
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder bZIP2Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream10 = aES256SHA256Decoder1.decode(inputStream2, coder3, byteArray9);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder11 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder13 = null;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream20 = aES256SHA256Decoder11.decode(inputStream12, coder13, byteArray19);
        org.apache.commons.compress.archivers.sevenz.Coder coder21 = null;
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream26 = aES256SHA256Decoder1.decode(inputStream20, coder21, byteArray25);
        org.apache.commons.compress.archivers.sevenz.Coder coder27 = null;
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream31 = bZIP2Decoder0.decode(inputStream26, coder27, byteArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 10, (byte) 0 });
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream10 = aES256SHA256Decoder1.decode(inputStream2, coder3, byteArray9);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder11 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder13 = null;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream20 = aES256SHA256Decoder11.decode(inputStream12, coder13, byteArray19);
        org.apache.commons.compress.archivers.sevenz.Coder coder21 = null;
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream26 = aES256SHA256Decoder1.decode(inputStream20, coder21, byteArray25);
        org.apache.commons.compress.archivers.sevenz.Coder coder27 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder28 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder30 = null;
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream37 = aES256SHA256Decoder28.decode(inputStream29, coder30, byteArray36);
        java.io.InputStream inputStream38 = copyDecoder0.decode(inputStream20, coder27, byteArray36);
        java.lang.Class<?> wildcardClass39 = copyDecoder0.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder3 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder5 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream12 = aES256SHA256Decoder3.decode(inputStream4, coder5, byteArray11);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder13 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder15 = null;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream22 = aES256SHA256Decoder13.decode(inputStream14, coder15, byteArray21);
        org.apache.commons.compress.archivers.sevenz.Coder coder23 = null;
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream28 = aES256SHA256Decoder3.decode(inputStream22, coder23, byteArray27);
        org.apache.commons.compress.archivers.sevenz.Coder coder29 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder30 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder32 = null;
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream39 = aES256SHA256Decoder30.decode(inputStream31, coder32, byteArray38);
        java.io.InputStream inputStream40 = copyDecoder2.decode(inputStream22, coder29, byteArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream41 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(outputStream0, sevenZMethod1, byteArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNotNull(inputStream40);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream11 = aES256SHA256Decoder2.decode(inputStream3, coder4, byteArray10);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder12 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder14 = null;
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream21 = aES256SHA256Decoder12.decode(inputStream13, coder14, byteArray20);
        org.apache.commons.compress.archivers.sevenz.Coder coder22 = null;
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream27 = aES256SHA256Decoder2.decode(inputStream21, coder22, byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream28 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(outputStream0, sevenZMethod1, byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream27);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder lZMADecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream11 = aES256SHA256Decoder2.decode(inputStream3, coder4, byteArray10);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder12 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder14 = null;
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream21 = aES256SHA256Decoder12.decode(inputStream13, coder14, byteArray20);
        org.apache.commons.compress.archivers.sevenz.Coder coder22 = null;
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream27 = aES256SHA256Decoder2.decode(inputStream21, coder22, byteArray26);
        org.apache.commons.compress.archivers.sevenz.Coder coder28 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder29 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder31 = null;
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream38 = aES256SHA256Decoder29.decode(inputStream30, coder31, byteArray37);
        java.io.InputStream inputStream39 = copyDecoder1.decode(inputStream21, coder28, byteArray37);
        org.apache.commons.compress.archivers.sevenz.Coder coder40 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder41 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder42 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream43 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder44 = null;
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream51 = aES256SHA256Decoder42.decode(inputStream43, coder44, byteArray50);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder52 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream53 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder54 = null;
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream61 = aES256SHA256Decoder52.decode(inputStream53, coder54, byteArray60);
        org.apache.commons.compress.archivers.sevenz.Coder coder62 = null;
        byte[] byteArray66 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream67 = aES256SHA256Decoder42.decode(inputStream61, coder62, byteArray66);
        org.apache.commons.compress.archivers.sevenz.Coder coder68 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder69 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream70 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder71 = null;
        byte[] byteArray77 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream78 = aES256SHA256Decoder69.decode(inputStream70, coder71, byteArray77);
        java.io.InputStream inputStream79 = copyDecoder41.decode(inputStream61, coder68, byteArray77);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream80 = lZMADecoder0.decode(inputStream39, coder40, byteArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream51);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream61);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream67);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream78);
        org.junit.Assert.assertNotNull(inputStream79);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder2 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream9 = aES256SHA256Decoder0.decode(inputStream1, coder2, byteArray8);
        java.lang.Class<?> wildcardClass10 = aES256SHA256Decoder0.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder deflateDecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder5 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder7 = null;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream14 = aES256SHA256Decoder5.decode(inputStream6, coder7, byteArray13);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder15 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder17 = null;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream24 = aES256SHA256Decoder15.decode(inputStream16, coder17, byteArray23);
        org.apache.commons.compress.archivers.sevenz.Coder coder25 = null;
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream30 = aES256SHA256Decoder5.decode(inputStream24, coder25, byteArray29);
        java.io.InputStream inputStream31 = copyDecoder2.decode(inputStream3, coder4, byteArray29);
        java.io.OutputStream outputStream32 = null;
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        java.io.OutputStream outputStream39 = copyDecoder2.encode(outputStream32, byteArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream40 = deflateDecoder0.encode(outputStream1, byteArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(outputStream39);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream10 = aES256SHA256Decoder1.decode(inputStream2, coder3, byteArray9);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder11 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder13 = null;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream20 = aES256SHA256Decoder11.decode(inputStream12, coder13, byteArray19);
        org.apache.commons.compress.archivers.sevenz.Coder coder21 = null;
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream26 = aES256SHA256Decoder1.decode(inputStream20, coder21, byteArray25);
        org.apache.commons.compress.archivers.sevenz.Coder coder27 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder28 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder30 = null;
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream37 = aES256SHA256Decoder28.decode(inputStream29, coder30, byteArray36);
        java.io.InputStream inputStream38 = copyDecoder0.decode(inputStream20, coder27, byteArray36);
        org.apache.commons.compress.archivers.sevenz.Coder coder39 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder40 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.OutputStream outputStream41 = null;
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) -1 };
        java.io.OutputStream outputStream45 = copyDecoder40.encode(outputStream41, byteArray44);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream46 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(inputStream38, coder39, byteArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNull(outputStream45);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder2 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream9 = aES256SHA256Decoder0.decode(inputStream1, coder2, byteArray8);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder11 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder12 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder14 = null;
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream21 = aES256SHA256Decoder12.decode(inputStream13, coder14, byteArray20);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder22 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder24 = null;
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream31 = aES256SHA256Decoder22.decode(inputStream23, coder24, byteArray30);
        org.apache.commons.compress.archivers.sevenz.Coder coder32 = null;
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream37 = aES256SHA256Decoder12.decode(inputStream31, coder32, byteArray36);
        org.apache.commons.compress.archivers.sevenz.Coder coder38 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder39 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder41 = null;
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream48 = aES256SHA256Decoder39.decode(inputStream40, coder41, byteArray47);
        java.io.InputStream inputStream49 = copyDecoder11.decode(inputStream31, coder38, byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream50 = aES256SHA256Decoder0.encode(outputStream10, byteArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: method doesn't support writing");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream31);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertNotNull(inputStream49);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder deflateDecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream11 = aES256SHA256Decoder2.decode(inputStream3, coder4, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream12 = deflateDecoder0.encode(outputStream1, byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream11);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.OutputStream outputStream2 = null;
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1 };
        java.io.OutputStream outputStream6 = copyDecoder1.encode(outputStream2, byteArray5);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId7 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod0, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) copyDecoder1);
        java.lang.Class<?> wildcardClass8 = coderId7.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNull(outputStream6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream11 = aES256SHA256Decoder2.decode(inputStream3, coder4, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream12 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(outputStream0, sevenZMethod1, byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream11);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder bZIP2Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder3 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder5 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream12 = aES256SHA256Decoder3.decode(inputStream4, coder5, byteArray11);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder13 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder15 = null;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream22 = aES256SHA256Decoder13.decode(inputStream14, coder15, byteArray21);
        org.apache.commons.compress.archivers.sevenz.Coder coder23 = null;
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream28 = aES256SHA256Decoder3.decode(inputStream22, coder23, byteArray27);
        org.apache.commons.compress.archivers.sevenz.Coder coder29 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder30 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder32 = null;
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream39 = aES256SHA256Decoder30.decode(inputStream31, coder32, byteArray38);
        java.io.InputStream inputStream40 = copyDecoder2.decode(inputStream22, coder29, byteArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream41 = bZIP2Decoder0.encode(outputStream1, byteArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNotNull(inputStream40);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder lZMADecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream10 = aES256SHA256Decoder1.decode(inputStream2, coder3, byteArray9);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder11 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder13 = null;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream20 = aES256SHA256Decoder11.decode(inputStream12, coder13, byteArray19);
        org.apache.commons.compress.archivers.sevenz.Coder coder21 = null;
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream26 = aES256SHA256Decoder1.decode(inputStream20, coder21, byteArray25);
        org.apache.commons.compress.archivers.sevenz.Coder coder27 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder28 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder29 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder31 = null;
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream38 = aES256SHA256Decoder29.decode(inputStream30, coder31, byteArray37);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder39 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream40 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder41 = null;
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream48 = aES256SHA256Decoder39.decode(inputStream40, coder41, byteArray47);
        org.apache.commons.compress.archivers.sevenz.Coder coder49 = null;
        byte[] byteArray53 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream54 = aES256SHA256Decoder29.decode(inputStream48, coder49, byteArray53);
        org.apache.commons.compress.archivers.sevenz.Coder coder55 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder56 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream57 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder58 = null;
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream65 = aES256SHA256Decoder56.decode(inputStream57, coder58, byteArray64);
        java.io.InputStream inputStream66 = copyDecoder28.decode(inputStream48, coder55, byteArray64);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream67 = lZMADecoder0.decode(inputStream26, coder27, byteArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream48);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream65);
        org.junit.Assert.assertNotNull(inputStream66);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder bZIP2Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream10 = aES256SHA256Decoder1.decode(inputStream2, coder3, byteArray9);
        org.apache.commons.compress.archivers.sevenz.Coder coder11 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder12 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder14 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder15 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder17 = null;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream24 = aES256SHA256Decoder15.decode(inputStream16, coder17, byteArray23);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder25 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder27 = null;
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream34 = aES256SHA256Decoder25.decode(inputStream26, coder27, byteArray33);
        org.apache.commons.compress.archivers.sevenz.Coder coder35 = null;
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream40 = aES256SHA256Decoder15.decode(inputStream34, coder35, byteArray39);
        java.io.InputStream inputStream41 = copyDecoder12.decode(inputStream13, coder14, byteArray39);
        java.io.OutputStream outputStream42 = null;
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        java.io.OutputStream outputStream49 = copyDecoder12.encode(outputStream42, byteArray48);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream50 = bZIP2Decoder0.decode(inputStream2, coder11, byteArray48);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No InputStream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream34);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertNull(inputStream41);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(outputStream49);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder lZMADecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream11 = aES256SHA256Decoder2.decode(inputStream3, coder4, byteArray10);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder12 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder14 = null;
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream21 = aES256SHA256Decoder12.decode(inputStream13, coder14, byteArray20);
        org.apache.commons.compress.archivers.sevenz.Coder coder22 = null;
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream27 = aES256SHA256Decoder2.decode(inputStream21, coder22, byteArray26);
        org.apache.commons.compress.archivers.sevenz.Coder coder28 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder29 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder31 = null;
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream38 = aES256SHA256Decoder29.decode(inputStream30, coder31, byteArray37);
        java.io.InputStream inputStream39 = copyDecoder1.decode(inputStream21, coder28, byteArray37);
        org.apache.commons.compress.archivers.sevenz.Coder coder40 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder41 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder43 = null;
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream50 = aES256SHA256Decoder41.decode(inputStream42, coder43, byteArray49);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder51 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream52 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder53 = null;
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream60 = aES256SHA256Decoder51.decode(inputStream52, coder53, byteArray59);
        org.apache.commons.compress.archivers.sevenz.Coder coder61 = null;
        byte[] byteArray65 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream66 = aES256SHA256Decoder41.decode(inputStream60, coder61, byteArray65);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream67 = lZMADecoder0.decode(inputStream21, coder40, byteArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream60);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream66);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderIdArray0 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] {};
        org.apache.commons.compress.archivers.sevenz.Coders.coderTable = coderIdArray0;
        org.apache.commons.compress.archivers.sevenz.Coders.coderTable = coderIdArray0;
        org.junit.Assert.assertNotNull(coderIdArray0);
        org.junit.Assert.assertArrayEquals(coderIdArray0, new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] {});
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder bZIP2Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder();
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder4 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder6 = null;
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream13 = aES256SHA256Decoder4.decode(inputStream5, coder6, byteArray12);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder14 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder16 = null;
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream23 = aES256SHA256Decoder14.decode(inputStream15, coder16, byteArray22);
        org.apache.commons.compress.archivers.sevenz.Coder coder24 = null;
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream29 = aES256SHA256Decoder4.decode(inputStream23, coder24, byteArray28);
        java.io.InputStream inputStream30 = copyDecoder1.decode(inputStream2, coder3, byteArray28);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder31 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder33 = null;
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream40 = aES256SHA256Decoder31.decode(inputStream32, coder33, byteArray39);
        org.apache.commons.compress.archivers.sevenz.Coder coder41 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder42 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream43 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder44 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder45 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream46 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder47 = null;
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream54 = aES256SHA256Decoder45.decode(inputStream46, coder47, byteArray53);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder55 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream56 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder57 = null;
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream64 = aES256SHA256Decoder55.decode(inputStream56, coder57, byteArray63);
        org.apache.commons.compress.archivers.sevenz.Coder coder65 = null;
        byte[] byteArray69 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream70 = aES256SHA256Decoder45.decode(inputStream64, coder65, byteArray69);
        java.io.InputStream inputStream71 = copyDecoder42.decode(inputStream43, coder44, byteArray69);
        java.io.OutputStream outputStream72 = null;
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        java.io.OutputStream outputStream79 = copyDecoder42.encode(outputStream72, byteArray78);
        java.io.InputStream inputStream80 = copyDecoder1.decode(inputStream40, coder41, byteArray78);
        org.apache.commons.compress.archivers.sevenz.Coder coder81 = null;
        byte[] byteArray87 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream88 = bZIP2Decoder0.decode(inputStream40, coder81, byteArray87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream64);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream70);
        org.junit.Assert.assertNull(inputStream71);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(outputStream79);
        org.junit.Assert.assertNotNull(inputStream80);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder2 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream9 = aES256SHA256Decoder0.decode(inputStream1, coder2, byteArray8);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder10 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder12 = null;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream19 = aES256SHA256Decoder10.decode(inputStream11, coder12, byteArray18);
        org.apache.commons.compress.archivers.sevenz.Coder coder20 = null;
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream25 = aES256SHA256Decoder0.decode(inputStream19, coder20, byteArray24);
        org.apache.commons.compress.archivers.sevenz.Coder coder26 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder27 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.OutputStream outputStream28 = null;
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) -1 };
        java.io.OutputStream outputStream32 = copyDecoder27.encode(outputStream28, byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream33 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(inputStream25, coder26, byteArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNull(outputStream32);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream11 = aES256SHA256Decoder2.decode(inputStream3, coder4, byteArray10);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder12 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder14 = null;
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream21 = aES256SHA256Decoder12.decode(inputStream13, coder14, byteArray20);
        org.apache.commons.compress.archivers.sevenz.Coder coder22 = null;
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream27 = aES256SHA256Decoder2.decode(inputStream21, coder22, byteArray26);
        org.apache.commons.compress.archivers.sevenz.Coder coder28 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder29 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder31 = null;
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream38 = aES256SHA256Decoder29.decode(inputStream30, coder31, byteArray37);
        java.io.InputStream inputStream39 = copyDecoder1.decode(inputStream21, coder28, byteArray37);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId40 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod0, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) copyDecoder1);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderBase coderBase41 = coderId40.coder;
        org.apache.commons.compress.archivers.sevenz.Coders.CoderBase coderBase42 = coderId40.coder;
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNotNull(coderBase41);
        org.junit.Assert.assertNotNull(coderBase42);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream10 = aES256SHA256Decoder1.decode(inputStream2, coder3, byteArray9);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder11 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder13 = null;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream20 = aES256SHA256Decoder11.decode(inputStream12, coder13, byteArray19);
        org.apache.commons.compress.archivers.sevenz.Coder coder21 = null;
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream26 = aES256SHA256Decoder1.decode(inputStream20, coder21, byteArray25);
        org.apache.commons.compress.archivers.sevenz.Coder coder27 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder28 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder30 = null;
        byte[] byteArray36 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream37 = aES256SHA256Decoder28.decode(inputStream29, coder30, byteArray36);
        java.io.InputStream inputStream38 = copyDecoder0.decode(inputStream20, coder27, byteArray36);
        org.apache.commons.compress.archivers.sevenz.Coder coder39 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder40 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder42 = null;
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream49 = aES256SHA256Decoder40.decode(inputStream41, coder42, byteArray48);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream50 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(inputStream38, coder39, byteArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream37);
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream49);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream11 = aES256SHA256Decoder2.decode(inputStream3, coder4, byteArray10);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder12 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder14 = null;
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream21 = aES256SHA256Decoder12.decode(inputStream13, coder14, byteArray20);
        org.apache.commons.compress.archivers.sevenz.Coder coder22 = null;
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream27 = aES256SHA256Decoder2.decode(inputStream21, coder22, byteArray26);
        org.apache.commons.compress.archivers.sevenz.Coder coder28 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder29 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder31 = null;
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream38 = aES256SHA256Decoder29.decode(inputStream30, coder31, byteArray37);
        java.io.InputStream inputStream39 = copyDecoder1.decode(inputStream21, coder28, byteArray37);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId40 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod0, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) copyDecoder1);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderBase coderBase41 = coderId40.coder;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod42 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder43 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder44 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream45 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder46 = null;
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream53 = aES256SHA256Decoder44.decode(inputStream45, coder46, byteArray52);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder54 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream55 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder56 = null;
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream63 = aES256SHA256Decoder54.decode(inputStream55, coder56, byteArray62);
        org.apache.commons.compress.archivers.sevenz.Coder coder64 = null;
        byte[] byteArray68 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream69 = aES256SHA256Decoder44.decode(inputStream63, coder64, byteArray68);
        org.apache.commons.compress.archivers.sevenz.Coder coder70 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder71 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream72 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder73 = null;
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream80 = aES256SHA256Decoder71.decode(inputStream72, coder73, byteArray79);
        java.io.InputStream inputStream81 = copyDecoder43.decode(inputStream63, coder70, byteArray79);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId82 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod42, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) copyDecoder43);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderBase coderBase83 = coderId82.coder;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod84 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder85 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.OutputStream outputStream86 = null;
        byte[] byteArray89 = new byte[] { (byte) 0, (byte) -1 };
        java.io.OutputStream outputStream90 = copyDecoder85.encode(outputStream86, byteArray89);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId91 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod84, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) copyDecoder85);
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod92 = coderId91.method;
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderIdArray93 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] { coderId40, coderId82, coderId91 };
        org.apache.commons.compress.archivers.sevenz.Coders.coderTable = coderIdArray93;
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNotNull(coderBase41);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream53);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream63);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream69);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream80);
        org.junit.Assert.assertNotNull(inputStream81);
        org.junit.Assert.assertNotNull(coderBase83);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNull(outputStream90);
        org.junit.Assert.assertNull(sevenZMethod92);
        org.junit.Assert.assertNotNull(coderIdArray93);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder2 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream9 = aES256SHA256Decoder0.decode(inputStream1, coder2, byteArray8);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder10 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder12 = null;
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream19 = aES256SHA256Decoder10.decode(inputStream11, coder12, byteArray18);
        org.apache.commons.compress.archivers.sevenz.Coder coder20 = null;
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream25 = aES256SHA256Decoder0.decode(inputStream19, coder20, byteArray24);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder26 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder28 = null;
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream35 = aES256SHA256Decoder26.decode(inputStream27, coder28, byteArray34);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder36 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream37 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder38 = null;
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream45 = aES256SHA256Decoder36.decode(inputStream37, coder38, byteArray44);
        org.apache.commons.compress.archivers.sevenz.Coder coder46 = null;
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream51 = aES256SHA256Decoder26.decode(inputStream45, coder46, byteArray50);
        org.apache.commons.compress.archivers.sevenz.Coder coder52 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder53 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream54 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder55 = null;
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream62 = aES256SHA256Decoder53.decode(inputStream54, coder55, byteArray61);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder63 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream64 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder65 = null;
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream72 = aES256SHA256Decoder63.decode(inputStream64, coder65, byteArray71);
        org.apache.commons.compress.archivers.sevenz.Coder coder73 = null;
        byte[] byteArray77 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream78 = aES256SHA256Decoder53.decode(inputStream72, coder73, byteArray77);
        java.io.InputStream inputStream79 = aES256SHA256Decoder0.decode(inputStream45, coder52, byteArray77);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream19);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream35);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream45);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream51);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream62);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream72);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream78);
        org.junit.Assert.assertNotNull(inputStream79);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder lZMADecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.LZMADecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream10 = aES256SHA256Decoder1.decode(inputStream2, coder3, byteArray9);
        org.apache.commons.compress.archivers.sevenz.Coder coder11 = null;
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream15 = lZMADecoder0.decode(inputStream10, coder11, byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 0 });
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream11 = aES256SHA256Decoder2.decode(inputStream3, coder4, byteArray10);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder12 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder14 = null;
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream21 = aES256SHA256Decoder12.decode(inputStream13, coder14, byteArray20);
        org.apache.commons.compress.archivers.sevenz.Coder coder22 = null;
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream27 = aES256SHA256Decoder2.decode(inputStream21, coder22, byteArray26);
        org.apache.commons.compress.archivers.sevenz.Coder coder28 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder29 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder31 = null;
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream38 = aES256SHA256Decoder29.decode(inputStream30, coder31, byteArray37);
        java.io.InputStream inputStream39 = copyDecoder1.decode(inputStream21, coder28, byteArray37);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId40 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod0, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) copyDecoder1);
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod41 = coderId40.method;
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream27);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream38);
        org.junit.Assert.assertNotNull(inputStream39);
        org.junit.Assert.assertNull(sevenZMethod41);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder deflateDecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder5 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder7 = null;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream14 = aES256SHA256Decoder5.decode(inputStream6, coder7, byteArray13);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder15 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder17 = null;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream24 = aES256SHA256Decoder15.decode(inputStream16, coder17, byteArray23);
        org.apache.commons.compress.archivers.sevenz.Coder coder25 = null;
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream30 = aES256SHA256Decoder5.decode(inputStream24, coder25, byteArray29);
        java.io.InputStream inputStream31 = copyDecoder2.decode(inputStream3, coder4, byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream32 = deflateDecoder0.encode(outputStream1, byteArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNull(inputStream31);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.lang.Class<?> wildcardClass1 = aES256SHA256Decoder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder deflateDecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder5 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder7 = null;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream14 = aES256SHA256Decoder5.decode(inputStream6, coder7, byteArray13);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder15 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder17 = null;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream24 = aES256SHA256Decoder15.decode(inputStream16, coder17, byteArray23);
        org.apache.commons.compress.archivers.sevenz.Coder coder25 = null;
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream30 = aES256SHA256Decoder5.decode(inputStream24, coder25, byteArray29);
        java.io.InputStream inputStream31 = copyDecoder2.decode(inputStream3, coder4, byteArray29);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder32 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder34 = null;
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream41 = aES256SHA256Decoder32.decode(inputStream33, coder34, byteArray40);
        org.apache.commons.compress.archivers.sevenz.Coder coder42 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder43 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream44 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder45 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder46 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream47 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder48 = null;
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream55 = aES256SHA256Decoder46.decode(inputStream47, coder48, byteArray54);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder56 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream57 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder58 = null;
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream65 = aES256SHA256Decoder56.decode(inputStream57, coder58, byteArray64);
        org.apache.commons.compress.archivers.sevenz.Coder coder66 = null;
        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream71 = aES256SHA256Decoder46.decode(inputStream65, coder66, byteArray70);
        java.io.InputStream inputStream72 = copyDecoder43.decode(inputStream44, coder45, byteArray70);
        java.io.OutputStream outputStream73 = null;
        byte[] byteArray79 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        java.io.OutputStream outputStream80 = copyDecoder43.encode(outputStream73, byteArray79);
        java.io.InputStream inputStream81 = copyDecoder2.decode(inputStream41, coder42, byteArray79);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream82 = deflateDecoder0.encode(outputStream1, byteArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream55);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream65);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream71);
        org.junit.Assert.assertNull(inputStream72);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(outputStream80);
        org.junit.Assert.assertNotNull(inputStream81);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder deflateDecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream11 = aES256SHA256Decoder2.decode(inputStream3, coder4, byteArray10);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder12 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder14 = null;
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream21 = aES256SHA256Decoder12.decode(inputStream13, coder14, byteArray20);
        org.apache.commons.compress.archivers.sevenz.Coder coder22 = null;
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream27 = aES256SHA256Decoder2.decode(inputStream21, coder22, byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream28 = deflateDecoder0.encode(outputStream1, byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream27);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder bZIP2Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder5 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder7 = null;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream14 = aES256SHA256Decoder5.decode(inputStream6, coder7, byteArray13);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder15 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder17 = null;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream24 = aES256SHA256Decoder15.decode(inputStream16, coder17, byteArray23);
        org.apache.commons.compress.archivers.sevenz.Coder coder25 = null;
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream30 = aES256SHA256Decoder5.decode(inputStream24, coder25, byteArray29);
        java.io.InputStream inputStream31 = copyDecoder2.decode(inputStream3, coder4, byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream32 = bZIP2Decoder0.encode(outputStream1, byteArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNull(inputStream31);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.OutputStream outputStream2 = null;
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1 };
        java.io.OutputStream outputStream6 = copyDecoder1.encode(outputStream2, byteArray5);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId7 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod0, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) copyDecoder1);
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod8 = coderId7.method;
        org.apache.commons.compress.archivers.sevenz.Coders.CoderBase coderBase9 = coderId7.coder;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod10 = coderId7.method;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNull(outputStream6);
        org.junit.Assert.assertNull(sevenZMethod8);
        org.junit.Assert.assertNotNull(coderBase9);
        org.junit.Assert.assertNull(sevenZMethod10);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.OutputStream outputStream2 = null;
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1 };
        java.io.OutputStream outputStream6 = copyDecoder1.encode(outputStream2, byteArray5);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId7 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod0, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) copyDecoder1);
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod8 = coderId7.method;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod9 = coderId7.method;
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNull(outputStream6);
        org.junit.Assert.assertNull(sevenZMethod8);
        org.junit.Assert.assertNull(sevenZMethod9);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder deflateDecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder2 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder3 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder5 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream12 = aES256SHA256Decoder3.decode(inputStream4, coder5, byteArray11);
        java.io.InputStream inputStream13 = deflateDecoder0.decode(inputStream1, coder2, byteArray11);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(inputStream13);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder2 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream9 = aES256SHA256Decoder0.decode(inputStream1, coder2, byteArray8);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder11 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.OutputStream outputStream12 = null;
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) -1 };
        java.io.OutputStream outputStream16 = copyDecoder11.encode(outputStream12, byteArray15);
        java.io.OutputStream outputStream17 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder18 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder20 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder21 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder23 = null;
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream30 = aES256SHA256Decoder21.decode(inputStream22, coder23, byteArray29);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder31 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder33 = null;
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream40 = aES256SHA256Decoder31.decode(inputStream32, coder33, byteArray39);
        org.apache.commons.compress.archivers.sevenz.Coder coder41 = null;
        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream46 = aES256SHA256Decoder21.decode(inputStream40, coder41, byteArray45);
        java.io.InputStream inputStream47 = copyDecoder18.decode(inputStream19, coder20, byteArray45);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder48 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream49 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder50 = null;
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream57 = aES256SHA256Decoder48.decode(inputStream49, coder50, byteArray56);
        org.apache.commons.compress.archivers.sevenz.Coder coder58 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder59 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream60 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder61 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder62 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream63 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder64 = null;
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream71 = aES256SHA256Decoder62.decode(inputStream63, coder64, byteArray70);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder72 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream73 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder74 = null;
        byte[] byteArray80 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream81 = aES256SHA256Decoder72.decode(inputStream73, coder74, byteArray80);
        org.apache.commons.compress.archivers.sevenz.Coder coder82 = null;
        byte[] byteArray86 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream87 = aES256SHA256Decoder62.decode(inputStream81, coder82, byteArray86);
        java.io.InputStream inputStream88 = copyDecoder59.decode(inputStream60, coder61, byteArray86);
        java.io.OutputStream outputStream89 = null;
        byte[] byteArray95 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        java.io.OutputStream outputStream96 = copyDecoder59.encode(outputStream89, byteArray95);
        java.io.InputStream inputStream97 = copyDecoder18.decode(inputStream57, coder58, byteArray95);
        java.io.OutputStream outputStream98 = copyDecoder11.encode(outputStream17, byteArray95);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream99 = aES256SHA256Decoder0.encode(outputStream10, byteArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: method doesn't support writing");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNull(outputStream16);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream46);
        org.junit.Assert.assertNull(inputStream47);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream57);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream71);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream81);
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream87);
        org.junit.Assert.assertNull(inputStream88);
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(outputStream96);
        org.junit.Assert.assertNotNull(inputStream97);
        org.junit.Assert.assertNull(outputStream98);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder4 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder5 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder7 = null;
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream14 = aES256SHA256Decoder5.decode(inputStream6, coder7, byteArray13);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder15 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder17 = null;
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream24 = aES256SHA256Decoder15.decode(inputStream16, coder17, byteArray23);
        org.apache.commons.compress.archivers.sevenz.Coder coder25 = null;
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream30 = aES256SHA256Decoder5.decode(inputStream24, coder25, byteArray29);
        java.io.InputStream inputStream31 = copyDecoder2.decode(inputStream3, coder4, byteArray29);
        java.io.OutputStream outputStream32 = null;
        byte[] byteArray38 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        java.io.OutputStream outputStream39 = copyDecoder2.encode(outputStream32, byteArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream40 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(outputStream0, sevenZMethod1, byteArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream14);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream30);
        org.junit.Assert.assertNull(inputStream31);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(outputStream39);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId[] coderIdArray0 = org.apache.commons.compress.archivers.sevenz.Coders.coderTable;
        org.apache.commons.compress.archivers.sevenz.Coders.coderTable = coderIdArray0;
        org.apache.commons.compress.archivers.sevenz.Coders.coderTable = coderIdArray0;
        org.apache.commons.compress.archivers.sevenz.Coders.coderTable = coderIdArray0;
        org.junit.Assert.assertNotNull(coderIdArray0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder bZIP2Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder();
        java.io.OutputStream outputStream1 = null;
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.OutputStream outputStream3 = bZIP2Decoder0.encode(outputStream1, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder2 = null;
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream9 = aES256SHA256Decoder0.decode(inputStream1, coder2, byteArray8);
        org.apache.commons.compress.archivers.sevenz.Coder coder10 = null;
        byte[] byteArray12 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream13 = org.apache.commons.compress.archivers.sevenz.Coders.addDecoder(inputStream1, coder10, byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100 });
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder deflateDecoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.DeflateDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId2 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod0, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) deflateDecoder1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder2 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder3 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder5 = null;
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream12 = aES256SHA256Decoder3.decode(inputStream4, coder5, byteArray11);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder13 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder15 = null;
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream22 = aES256SHA256Decoder13.decode(inputStream14, coder15, byteArray21);
        org.apache.commons.compress.archivers.sevenz.Coder coder23 = null;
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream28 = aES256SHA256Decoder3.decode(inputStream22, coder23, byteArray27);
        java.io.InputStream inputStream29 = copyDecoder0.decode(inputStream1, coder2, byteArray27);
        java.io.OutputStream outputStream30 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder31 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder33 = null;
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream40 = aES256SHA256Decoder31.decode(inputStream32, coder33, byteArray39);
        java.io.OutputStream outputStream41 = copyDecoder0.encode(outputStream30, byteArray39);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream22);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream28);
        org.junit.Assert.assertNull(inputStream29);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertNull(outputStream41);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder4 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder6 = null;
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream13 = aES256SHA256Decoder4.decode(inputStream5, coder6, byteArray12);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder14 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder16 = null;
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream23 = aES256SHA256Decoder14.decode(inputStream15, coder16, byteArray22);
        org.apache.commons.compress.archivers.sevenz.Coder coder24 = null;
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream29 = aES256SHA256Decoder4.decode(inputStream23, coder24, byteArray28);
        java.io.InputStream inputStream30 = copyDecoder1.decode(inputStream2, coder3, byteArray28);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder31 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder33 = null;
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream40 = aES256SHA256Decoder31.decode(inputStream32, coder33, byteArray39);
        org.apache.commons.compress.archivers.sevenz.Coder coder41 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder42 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream43 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder44 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder45 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream46 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder47 = null;
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream54 = aES256SHA256Decoder45.decode(inputStream46, coder47, byteArray53);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder55 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream56 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder57 = null;
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream64 = aES256SHA256Decoder55.decode(inputStream56, coder57, byteArray63);
        org.apache.commons.compress.archivers.sevenz.Coder coder65 = null;
        byte[] byteArray69 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream70 = aES256SHA256Decoder45.decode(inputStream64, coder65, byteArray69);
        java.io.InputStream inputStream71 = copyDecoder42.decode(inputStream43, coder44, byteArray69);
        java.io.OutputStream outputStream72 = null;
        byte[] byteArray78 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        java.io.OutputStream outputStream79 = copyDecoder42.encode(outputStream72, byteArray78);
        java.io.InputStream inputStream80 = copyDecoder1.decode(inputStream40, coder41, byteArray78);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId81 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod0, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) copyDecoder1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertNull(inputStream30);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream54);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream64);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream70);
        org.junit.Assert.assertNull(inputStream71);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(outputStream79);
        org.junit.Assert.assertNotNull(inputStream80);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder bZIP2Decoder0 = new org.apache.commons.compress.archivers.sevenz.Coders.BZIP2Decoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder1 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder3 = null;
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream10 = aES256SHA256Decoder1.decode(inputStream2, coder3, byteArray9);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder11 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder13 = null;
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream20 = aES256SHA256Decoder11.decode(inputStream12, coder13, byteArray19);
        org.apache.commons.compress.archivers.sevenz.Coder coder21 = null;
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream26 = aES256SHA256Decoder1.decode(inputStream20, coder21, byteArray25);
        org.apache.commons.compress.archivers.sevenz.Coder coder27 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder28 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.InputStream inputStream29 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder30 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder31 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder33 = null;
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream40 = aES256SHA256Decoder31.decode(inputStream32, coder33, byteArray39);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder41 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream42 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder43 = null;
        byte[] byteArray49 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream50 = aES256SHA256Decoder41.decode(inputStream42, coder43, byteArray49);
        org.apache.commons.compress.archivers.sevenz.Coder coder51 = null;
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream56 = aES256SHA256Decoder31.decode(inputStream50, coder51, byteArray55);
        java.io.InputStream inputStream57 = copyDecoder28.decode(inputStream29, coder30, byteArray55);
        java.io.OutputStream outputStream58 = null;
        byte[] byteArray64 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 };
        java.io.OutputStream outputStream65 = copyDecoder28.encode(outputStream58, byteArray64);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream66 = bZIP2Decoder0.decode(inputStream20, coder27, byteArray64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream10);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream20);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream26);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream50);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream56);
        org.junit.Assert.assertNull(inputStream57);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(outputStream65);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod1 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod2 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder3 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder4 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder6 = null;
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream13 = aES256SHA256Decoder4.decode(inputStream5, coder6, byteArray12);
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder14 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder16 = null;
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream23 = aES256SHA256Decoder14.decode(inputStream15, coder16, byteArray22);
        org.apache.commons.compress.archivers.sevenz.Coder coder24 = null;
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        java.io.InputStream inputStream29 = aES256SHA256Decoder4.decode(inputStream23, coder24, byteArray28);
        org.apache.commons.compress.archivers.sevenz.Coder coder30 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder aES256SHA256Decoder31 = new org.apache.commons.compress.archivers.sevenz.Coders.AES256SHA256Decoder();
        java.io.InputStream inputStream32 = null;
        org.apache.commons.compress.archivers.sevenz.Coder coder33 = null;
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 };
        java.io.InputStream inputStream40 = aES256SHA256Decoder31.decode(inputStream32, coder33, byteArray39);
        java.io.InputStream inputStream41 = copyDecoder3.decode(inputStream23, coder30, byteArray39);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId42 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod2, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) copyDecoder3);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderBase coderBase43 = coderId42.coder;
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId44 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod1, coderBase43);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId45 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod0, coderBase43);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream13);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream23);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(inputStream29);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(inputStream40);
        org.junit.Assert.assertNotNull(inputStream41);
        org.junit.Assert.assertNotNull(coderBase43);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod1 = null;
        org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder copyDecoder2 = new org.apache.commons.compress.archivers.sevenz.Coders.CopyDecoder();
        java.io.OutputStream outputStream3 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1 };
        java.io.OutputStream outputStream7 = copyDecoder2.encode(outputStream3, byteArray6);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId8 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod1, (org.apache.commons.compress.archivers.sevenz.Coders.CoderBase) copyDecoder2);
        org.apache.commons.compress.archivers.sevenz.Coders.CoderBase coderBase9 = coderId8.coder;
        org.apache.commons.compress.archivers.sevenz.Coders.CoderBase coderBase10 = coderId8.coder;
        org.apache.commons.compress.archivers.sevenz.Coders.CoderId coderId11 = new org.apache.commons.compress.archivers.sevenz.Coders.CoderId(sevenZMethod0, coderBase10);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertNull(outputStream7);
        org.junit.Assert.assertNotNull(coderBase9);
        org.junit.Assert.assertNotNull(coderBase10);
    }
}

