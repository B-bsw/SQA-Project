package org.apache.commons.compress.compressors;

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
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.LZMA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lzma" + "'", str0, "lzma");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream1 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.DEFLATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "deflate" + "'", str0, "deflate");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.XZ;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xz" + "'", str0, "xz");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.Z;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "z" + "'", str0, "z");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.SNAPPY_FRAMED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "snappy-framed" + "'", str0, "snappy-framed");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.PACK200;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack200" + "'", str0, "pack200");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream4 = compressorStreamFactory1.createCompressorInputStream(inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        java.lang.Class<?> wildcardClass3 = compressorStreamFactory1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream4 = compressorStreamFactory1.createCompressorOutputStream("pack200", outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.SNAPPY_RAW;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "snappy-raw" + "'", str0, "snappy-raw");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.GZIP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gz" + "'", str0, "gz");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.BZIP2;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bzip2" + "'", str0, "bzip2");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream3 = compressorStreamFactory0.createCompressorInputStream("", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        // The following exception was thrown during execution in test generation
        try {
            compressorStreamFactory1.setDecompressConcatenated(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot override the setting defined by the constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        java.lang.Class<?> wildcardClass1 = compressorStreamFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream4 = compressorStreamFactory1.createCompressorOutputStream("deflate", outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream3 = compressorStreamFactory1.createCompressorInputStream(inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream4 = compressorStreamFactory1.createCompressorOutputStream("", outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream4 = compressorStreamFactory1.createCompressorOutputStream("lzma", outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(false);
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream4 = compressorStreamFactory0.createCompressorInputStream(inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        // The following exception was thrown during execution in test generation
        try {
            compressorStreamFactory1.setDecompressConcatenated(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot override the setting defined by the constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean5 = compressorStreamFactory1.getDecompressConcatenated();
        java.lang.Class<?> wildcardClass6 = compressorStreamFactory1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream6 = compressorStreamFactory1.createCompressorInputStream("pack200", inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream2 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(inputStream0, deflateParameters1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(false);
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream5 = compressorStreamFactory0.createCompressorInputStream("xz", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream4 = compressorStreamFactory1.createCompressorOutputStream("xz", outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        // The following exception was thrown during execution in test generation
        try {
            compressorStreamFactory1.setDecompressConcatenated(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot override the setting defined by the constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        java.lang.Class<?> wildcardClass2 = compressorStreamFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        // The following exception was thrown during execution in test generation
        try {
            compressorStreamFactory1.setDecompressConcatenated(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot override the setting defined by the constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream2 = compressorStreamFactory0.createCompressorInputStream(inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        // The following exception was thrown during execution in test generation
        try {
            compressorStreamFactory1.setDecompressConcatenated(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot override the setting defined by the constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean5 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean6 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream8 = compressorStreamFactory1.createCompressorInputStream(inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream4 = compressorStreamFactory0.createCompressorInputStream("snappy-framed", inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        java.lang.Class<?> wildcardClass4 = compressorStreamFactory1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream3 = compressorStreamFactory0.createCompressorOutputStream("lzma", outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(false);
        java.lang.Class<?> wildcardClass3 = compressorStreamFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean5 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream8 = compressorStreamFactory1.createCompressorOutputStream("gz", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean5 = compressorStreamFactory1.getDecompressConcatenated();
        // The following exception was thrown during execution in test generation
        try {
            compressorStreamFactory1.setDecompressConcatenated(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot override the setting defined by the constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream4 = compressorStreamFactory0.createCompressorInputStream("", inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(true);
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream4 = compressorStreamFactory1.createCompressorInputStream("lzma", inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream6 = compressorStreamFactory1.createCompressorOutputStream("snappy-raw", outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream5 = compressorStreamFactory1.createCompressorInputStream("snappy-framed", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream5 = compressorStreamFactory1.createCompressorInputStream("snappy-raw", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream5 = compressorStreamFactory0.createCompressorInputStream("", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.lang.Class<?> wildcardClass2 = compressorStreamFactory1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(true);
        java.lang.Class<?> wildcardClass2 = compressorStreamFactory1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        // The following exception was thrown during execution in test generation
        try {
            compressorStreamFactory1.setDecompressConcatenated(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot override the setting defined by the constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream5 = compressorStreamFactory1.createCompressorOutputStream("bzip2", outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream7 = compressorStreamFactory1.createCompressorInputStream("deflate", inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream5 = compressorStreamFactory1.createCompressorOutputStream("", outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream3 = compressorStreamFactory0.createCompressorInputStream(inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream5 = compressorStreamFactory1.createCompressorInputStream(inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream6 = compressorStreamFactory0.createCompressorOutputStream("z", outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        compressorStreamFactory0.setDecompressConcatenated(false);
        java.lang.Class<?> wildcardClass4 = compressorStreamFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream5 = compressorStreamFactory1.createCompressorOutputStream("snappy-framed", outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory0.getDecompressConcatenated();
        java.lang.Class<?> wildcardClass4 = compressorStreamFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        java.lang.Class<?> wildcardClass5 = compressorStreamFactory1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(true);
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream4 = compressorStreamFactory1.createCompressorInputStream("snappy-framed", inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean5 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean6 = compressorStreamFactory1.getDecompressConcatenated();
        java.lang.Class<?> wildcardClass7 = compressorStreamFactory1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream5 = compressorStreamFactory0.createCompressorInputStream("snappy-framed", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean5 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream8 = compressorStreamFactory1.createCompressorInputStream("lzma", inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(false);
        compressorStreamFactory0.setDecompressConcatenated(true);
        boolean boolean5 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream8 = compressorStreamFactory0.createCompressorOutputStream("snappy-raw", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream6 = compressorStreamFactory0.createCompressorOutputStream("hi!", outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream5 = compressorStreamFactory0.createCompressorInputStream("gz", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(false);
        compressorStreamFactory0.setDecompressConcatenated(true);
        boolean boolean5 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream8 = compressorStreamFactory0.createCompressorOutputStream("lzma", outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(true);
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream3 = compressorStreamFactory1.createCompressorInputStream(inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream3 = compressorStreamFactory0.createCompressorOutputStream("", outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(true);
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream5 = compressorStreamFactory0.createCompressorInputStream("bzip2", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream7 = compressorStreamFactory1.createCompressorOutputStream("lzma", outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        compressorStreamFactory0.setDecompressConcatenated(false);
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream5 = compressorStreamFactory0.createCompressorInputStream(inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(false);
        compressorStreamFactory0.setDecompressConcatenated(true);
        compressorStreamFactory0.setDecompressConcatenated(true);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream4 = compressorStreamFactory0.createCompressorOutputStream("hi!", outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory0.getDecompressConcatenated();
        compressorStreamFactory0.setDecompressConcatenated(false);
        compressorStreamFactory0.setDecompressConcatenated(false);
        java.io.InputStream inputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream10 = compressorStreamFactory0.createCompressorInputStream("", inputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        java.lang.Class<?> wildcardClass3 = compressorStreamFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory0.getDecompressConcatenated();
        compressorStreamFactory0.setDecompressConcatenated(false);
        java.lang.Class<?> wildcardClass6 = compressorStreamFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(true);
        compressorStreamFactory0.setDecompressConcatenated(true);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream5 = compressorStreamFactory1.createCompressorInputStream("lzma", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean5 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean6 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream9 = compressorStreamFactory1.createCompressorInputStream("deflate", inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream4 = compressorStreamFactory0.createCompressorOutputStream("snappy-raw", outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(true);
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream4 = compressorStreamFactory1.createCompressorInputStream("deflate", inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean5 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream8 = compressorStreamFactory1.createCompressorInputStream("deflate", inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean5 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean6 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean7 = compressorStreamFactory1.getDecompressConcatenated();
        java.lang.Class<?> wildcardClass8 = compressorStreamFactory1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(true);
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream5 = compressorStreamFactory0.createCompressorInputStream("xz", inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean5 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean6 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean7 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream9 = compressorStreamFactory1.createCompressorInputStream(inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory0.getDecompressConcatenated();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(false);
        compressorStreamFactory0.setDecompressConcatenated(true);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream7 = compressorStreamFactory0.createCompressorOutputStream("lzma", outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        compressorStreamFactory0.setDecompressConcatenated(false);
        compressorStreamFactory0.setDecompressConcatenated(true);
        boolean boolean5 = compressorStreamFactory0.getDecompressConcatenated();
        java.io.InputStream inputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream8 = compressorStreamFactory0.createCompressorInputStream("gz", inputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        compressorStreamFactory0.setDecompressConcatenated(false);
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream7 = compressorStreamFactory0.createCompressorInputStream("bzip2", inputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(true);
        // The following exception was thrown during execution in test generation
        try {
            compressorStreamFactory1.setDecompressConcatenated(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot override the setting defined by the constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        boolean boolean2 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean3 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean4 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean5 = compressorStreamFactory1.getDecompressConcatenated();
        boolean boolean6 = compressorStreamFactory1.getDecompressConcatenated();
        java.io.InputStream inputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream9 = compressorStreamFactory1.createCompressorInputStream("snappy-framed", inputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream4 = compressorStreamFactory1.createCompressorInputStream("xz", inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean1 = compressorStreamFactory0.getDecompressConcatenated();
        boolean boolean2 = compressorStreamFactory0.getDecompressConcatenated();
        compressorStreamFactory0.setDecompressConcatenated(false);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream7 = compressorStreamFactory0.createCompressorOutputStream("bzip2", outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

