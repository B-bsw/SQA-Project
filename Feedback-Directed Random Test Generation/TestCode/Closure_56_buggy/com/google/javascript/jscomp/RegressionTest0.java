package com.google.javascript.jscomp;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile.OnDisk onDisk2 = new com.google.javascript.jscomp.SourceFile.OnDisk(file0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("", "", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("hi!", "", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = preloaded3.getLineOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromInputStream("", inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = sourceFile2.getLineOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        java.lang.Class<?> wildcardClass8 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("", charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("", "hi!", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        java.lang.Class<?> wildcardClass3 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("", generator1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("", generator1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.io.InputStream inputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromInputStream("hi!", inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("", reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile.OnDisk onDisk1 = new com.google.javascript.jscomp.SourceFile.OnDisk(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile(file0, charset1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str9 = preloaded3.getLine((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.Class<?> wildcardClass12 = sourceFile11.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.Class<?> wildcardClass8 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("", reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.Class<?> wildcardClass5 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader3 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromInputStream("hi!", "hi!", inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = sourceFile2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader4 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.Class<?> wildcardClass12 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(region5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        java.lang.Class<?> wildcardClass6 = preloaded3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.toString();
        java.io.Reader reader12 = sourceFile10.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("", reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.String str5 = sourceFile2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        sourceFile2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader5 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile2.getLineOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader4 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile2.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        java.lang.Class<?> wildcardClass9 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region8 = preloaded2.getRegion(0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        java.lang.String str5 = sourceFile2.getCodeNoCache();
        java.lang.Class<?> wildcardClass6 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.lang.Class<?> wildcardClass3 = preloaded2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = preloaded3.getLineOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = generated2.getLineOffset((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = sourceFile2.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.String str5 = sourceFile2.getCodeNoCache();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region8 = sourceFile2.getRegion(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region6 = generated2.getRegion(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader5 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.String str5 = sourceFile2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region7 = sourceFile2.getRegion((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("", reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = generated2.getLine(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        java.lang.String str5 = sourceFile2.getCodeNoCache();
        boolean boolean6 = sourceFile2.isExtern();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = generated2.getLineOffset((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.clearCachedSource();
        sourceFile3.setIsExtern(false);
        java.lang.String str7 = sourceFile3.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion(0);
        preloaded3.setOriginalPath("");
        int int11 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile2.getLineOffset((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region7 = generated2.getRegion(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        boolean boolean16 = preloaded3.isExtern();
        boolean boolean17 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        boolean boolean3 = sourceFile2.hasSourceInMemory();
        int int4 = sourceFile2.getNumLines();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = preloaded3.getLineOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile2.getLineOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        java.lang.String str14 = sourceFile9.getLine((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = sourceFile9.getLineOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        preloaded2.setIsExtern(false);
        java.lang.Class<?> wildcardClass8 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.String str5 = sourceFile2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region7 = sourceFile2.getRegion((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = preloaded2.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        int int13 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.String str5 = sourceFile2.getCodeNoCache();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        java.lang.String str7 = sourceFile2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile3.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = preloaded3.getLineOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str9 = preloaded3.getLine((int) (short) 10);
        java.lang.String str10 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader3 = preloaded2.getCodeReader();
        java.lang.Class<?> wildcardClass4 = reader3.getClass();
        org.junit.Assert.assertNotNull(reader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.io.Reader reader6 = preloaded2.getCodeReader();
        boolean boolean7 = preloaded2.isExtern();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        java.lang.Class<?> wildcardClass4 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        int int10 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(region12);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str6 = sourceFile5.getOriginalPath();
        java.io.Reader reader7 = sourceFile5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("", reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(sourceFile8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        boolean boolean5 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        preloaded3.setOriginalPath("hi!");
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        sourceFile3.setOriginalPath("");
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader4 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromReader("", reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader4);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getLine((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getOriginalPath();
        java.lang.Class<?> wildcardClass4 = preloaded2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        java.lang.String str7 = preloaded3.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = preloaded3.getLineOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile4.getOriginalPath();
        java.io.Reader reader6 = sourceFile4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("", reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str12 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        java.lang.String str7 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = sourceFile2.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        boolean boolean6 = sourceFile2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile2.getLineOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        java.lang.String str11 = preloaded3.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        sourceFile2.setOriginalPath("hi!");
        int int8 = sourceFile2.getLineOffset(1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = sourceFile2.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getCodeNoCache();
        java.lang.Class<?> wildcardClass12 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.Class<?> wildcardClass12 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine((int) (short) 10);
        sourceFile9.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        generated2.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded3.getLineOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = sourceFile2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        sourceFile2.setOriginalPath("hi!");
        int int8 = sourceFile2.getLineOffset(1);
        sourceFile2.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader11 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = preloaded2.getLineOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.Class<?> wildcardClass7 = generated2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        java.lang.Class<?> wildcardClass13 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        int int9 = preloaded3.getNumLines();
        java.lang.Class<?> wildcardClass10 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getName();
        sourceFile9.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        boolean boolean11 = preloaded4.isExtern();
        boolean boolean12 = preloaded4.isExtern();
        java.io.Reader reader13 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("", reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.Class<?> wildcardClass8 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(false);
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile4.getCode();
        java.io.Reader reader6 = sourceFile4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("", reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        int int8 = preloaded3.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded3.getLineOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        java.lang.String str6 = preloaded2.getName();
        java.lang.String str8 = preloaded2.getLine(100);
        java.lang.String str9 = preloaded2.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        boolean boolean8 = sourceFile7.hasSourceInMemory();
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader8 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        java.lang.String str12 = preloaded3.getOriginalPath();
        preloaded3.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = preloaded3.getLineOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        boolean boolean8 = preloaded4.hasSourceInMemory();
        boolean boolean9 = preloaded4.hasSourceInMemory();
        preloaded4.setOriginalPath("");
        java.io.Reader reader12 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("", reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        preloaded3.clearCachedSource();
        java.lang.String str8 = preloaded3.getOriginalPath();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = preloaded3.getLineOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        boolean boolean8 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion(10);
        java.io.Reader reader12 = preloaded3.getCodeReader();
        java.lang.String str13 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.toString();
        sourceFile2.setOriginalPath("");
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.Class<?> wildcardClass9 = preloaded3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        java.lang.Class<?> wildcardClass7 = generated2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.Class<?> wildcardClass6 = preloaded3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        sourceFile7.setIsExtern(false);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = preloaded3.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded3.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        java.lang.String str12 = sourceFile11.toString();
        java.io.Reader reader13 = sourceFile11.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("", reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.Class<?> wildcardClass3 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region10 = generated2.getRegion((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded5.toString();
        int int9 = preloaded5.getNumLines();
        preloaded5.clearCachedSource();
        java.lang.String str11 = preloaded5.toString();
        com.google.javascript.jscomp.Region region13 = preloaded5.getRegion(10);
        java.io.Reader reader14 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("", reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        boolean boolean6 = sourceFile2.hasSourceInMemory();
        java.lang.Class<?> wildcardClass7 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.getOriginalPath();
        java.lang.String str5 = sourceFile2.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        preloaded3.clearCachedSource();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        java.lang.String str6 = preloaded2.getName();
        java.lang.String str8 = preloaded2.getLine(100);
        java.lang.Class<?> wildcardClass9 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getCode();
        java.io.Reader reader5 = sourceFile3.getCodeReader();
        java.lang.String str6 = sourceFile3.getName();
        java.lang.String str7 = sourceFile3.getName();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        java.lang.Class<?> wildcardClass7 = preloaded3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        java.lang.Class<?> wildcardClass7 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        java.lang.String str7 = generated2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded3.getLineOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getCodeNoCache();
        java.lang.String str3 = sourceFile1.getCode();
        sourceFile1.setOriginalPath("hi!");
        java.lang.String str6 = sourceFile1.getCodeNoCache();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getName();
        java.lang.String str10 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = generated2.getLineOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sourceFile2.getLine((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        java.lang.Class<?> wildcardClass10 = preloaded3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        preloaded3.clearCachedSource();
        java.lang.Class<?> wildcardClass15 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        int int4 = sourceFile3.getNumLines();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.lang.String str3 = sourceFile2.getName();
        sourceFile2.setIsExtern(false);
        java.lang.String str7 = sourceFile2.getLine(1);
        java.lang.String str8 = sourceFile2.getName();
        java.lang.Class<?> wildcardClass9 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "");
        java.lang.String str4 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        java.lang.Class<?> wildcardClass7 = preloaded3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.lang.Class<?> wildcardClass15 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        java.lang.String str13 = preloaded3.getCode();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = preloaded3.getLineOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getCode();
        java.lang.Class<?> wildcardClass12 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        java.lang.String str5 = sourceFile2.getName();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded3.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getLine((int) (short) -1);
        preloaded3.clearCachedSource();
        java.lang.Class<?> wildcardClass17 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.lang.String str3 = sourceFile2.getName();
        sourceFile2.setIsExtern(false);
        boolean boolean6 = sourceFile2.hasSourceInMemory();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        int int12 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        java.lang.String str13 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        boolean boolean11 = preloaded3.isExtern();
        java.lang.String str12 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        com.google.javascript.jscomp.Region region7 = preloaded2.getRegion(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(region7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        java.lang.Class<?> wildcardClass12 = generated2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        java.lang.String str14 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region17 = preloaded3.getRegion((int) 'a');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(region17);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        boolean boolean9 = preloaded2.isExtern();
        java.lang.String str10 = preloaded2.getOriginalPath();
        boolean boolean11 = preloaded2.isExtern();
        java.lang.Class<?> wildcardClass12 = preloaded2.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int5 = preloaded4.getNumLines();
        java.lang.String str6 = preloaded4.getCodeNoCache();
        java.lang.String str7 = preloaded4.getCodeNoCache();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("", reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getCodeNoCache();
        java.lang.String str3 = sourceFile1.getCode();
        java.lang.String str4 = sourceFile1.getCodeNoCache();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        boolean boolean8 = preloaded4.hasSourceInMemory();
        boolean boolean9 = preloaded4.hasSourceInMemory();
        preloaded4.setOriginalPath("");
        java.io.Reader reader12 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader12);
        sourceFile13.setIsExtern(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(sourceFile13);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader6 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("", reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(sourceFile8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        preloaded3.setIsExtern(false);
        java.lang.Class<?> wildcardClass14 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.toString();
        java.lang.Class<?> wildcardClass6 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.setIsExtern(true);
        boolean boolean15 = preloaded3.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = preloaded3.getLineOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded5.toString();
        int int9 = preloaded5.getNumLines();
        com.google.javascript.jscomp.Region region11 = preloaded5.getRegion((int) '#');
        preloaded5.setOriginalPath("");
        java.io.Reader reader14 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("", reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        java.lang.String str9 = preloaded3.toString();
        boolean boolean10 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        boolean boolean12 = sourceFile9.isExtern();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (short) 10);
        sourceFile9.setOriginalPath("");
        int int17 = sourceFile9.getNumLines();
        sourceFile9.setIsExtern(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.clearCachedSource();
        java.lang.Class<?> wildcardClass12 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded7 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str9 = preloaded7.getLine((int) (byte) 10);
        boolean boolean10 = preloaded7.isExtern();
        java.io.Reader reader11 = preloaded7.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader11);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader11);
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("", reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNotNull(sourceFile14);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile4.setOriginalPath("");
        sourceFile4.setOriginalPath("");
        java.io.Reader reader9 = sourceFile4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("", reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertNotNull(reader9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean11 = generated2.isExtern();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.Class<?> wildcardClass14 = generated2.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        java.lang.String str11 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        preloaded3.setOriginalPath("");
        java.lang.String str13 = preloaded3.getCode();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        preloaded3.setOriginalPath("hi!");
        java.io.Reader reader13 = preloaded3.getCodeReader();
        java.lang.Class<?> wildcardClass14 = reader13.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str12 = preloaded3.getLine((int) '4');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        int int9 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str9 = preloaded3.getCode();
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        java.lang.String str4 = preloaded2.getCode();
        java.lang.String str5 = preloaded2.getCode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        boolean boolean9 = preloaded2.isExtern();
        java.lang.String str10 = preloaded2.getOriginalPath();
        boolean boolean11 = preloaded2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded2.getLineOffset((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.io.Reader reader12 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = preloaded3.getLineOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("");
        java.lang.String str5 = sourceFile1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("");
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        preloaded3.setOriginalPath("");
        java.lang.String str13 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        java.lang.String str12 = preloaded3.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = preloaded3.getLineOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = sourceFile9.getLineOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        boolean boolean6 = sourceFile2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.lang.String str3 = sourceFile2.getName();
        sourceFile2.setIsExtern(false);
        java.lang.String str7 = sourceFile2.getLine(1);
        java.lang.String str8 = sourceFile2.getCode();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean6 = generated2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        boolean boolean11 = sourceFile9.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = sourceFile9.getLineOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        sourceFile2.setIsExtern(true);
        int int7 = sourceFile2.getNumLines();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.clearCachedSource();
        java.lang.String str6 = preloaded2.getOriginalPath();
        java.io.Reader reader7 = preloaded2.getCodeReader();
        int int8 = preloaded2.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded2.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        boolean boolean11 = preloaded3.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded3.getLineOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded3.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        boolean boolean11 = sourceFile9.hasSourceInMemory();
        java.lang.String str12 = sourceFile9.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = sourceFile9.getLineOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        java.lang.Class<?> wildcardClass11 = generated2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        sourceFile2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader7 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        java.lang.String str13 = sourceFile9.getCode();
        boolean boolean14 = sourceFile9.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 0);
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) (short) 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertNotNull(region15);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        int int11 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = sourceFile2.getLineOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        boolean boolean12 = sourceFile9.isExtern();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (short) 10);
        sourceFile9.setOriginalPath("");
        int int17 = sourceFile9.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = sourceFile9.getLineOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getName();
        java.lang.Class<?> wildcardClass9 = generated2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = sourceFile9.getLineOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader11 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass4 = preloaded3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        boolean boolean13 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        boolean boolean7 = preloaded2.isExtern();
        com.google.javascript.jscomp.Region region9 = preloaded2.getRegion((int) '4');
        boolean boolean10 = preloaded2.isExtern();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        preloaded3.setIsExtern(false);
        java.lang.String str9 = preloaded3.getLine((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int11 = preloaded3.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        java.lang.String str12 = preloaded3.getOriginalPath();
        int int13 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getCode();
        java.lang.String str12 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.lang.String str11 = sourceFile9.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        sourceFile13.setOriginalPath("hi!");
        java.lang.String str17 = sourceFile13.getLine(100);
        java.io.Reader reader18 = sourceFile13.getCodeReader();
        boolean boolean19 = sourceFile13.isExtern();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader14 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        preloaded3.setOriginalPath("");
        java.lang.String str9 = preloaded3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int3 = preloaded2.getNumLines();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.toString();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        int int9 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) '#');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        preloaded3.setIsExtern(false);
        java.lang.String str13 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.toString();
        java.lang.String str9 = preloaded3.getOriginalPath();
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        com.google.javascript.jscomp.Region region11 = sourceFile9.getRegion((int) '#');
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion((int) (short) 1);
        int int14 = sourceFile9.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        sourceFile3.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = sourceFile3.getLineOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        java.lang.String str7 = preloaded3.getCode();
        java.lang.String str8 = preloaded3.getOriginalPath();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader6 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        sourceFile9.clearCachedSource();
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.lang.String str11 = sourceFile9.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("");
        java.lang.String str13 = preloaded3.getLine(0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.toString();
        java.lang.String str13 = sourceFile9.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getCode();
        java.io.Reader reader5 = sourceFile3.getCodeReader();
        sourceFile3.setOriginalPath("hi!");
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        int int8 = preloaded3.getNumLines();
        java.lang.Class<?> wildcardClass9 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded5.toString();
        int int9 = preloaded5.getNumLines();
        com.google.javascript.jscomp.Region region11 = preloaded5.getRegion((int) '#');
        java.lang.String str12 = preloaded5.toString();
        java.io.Reader reader13 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("", reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("");
        java.lang.String str16 = sourceFile9.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = sourceFile9.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        java.lang.String str9 = preloaded2.getCode();
        preloaded2.clearCachedSource();
        java.lang.String str11 = preloaded2.getOriginalPath();
        java.lang.String str12 = preloaded2.getCodeNoCache();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getName();
        java.lang.String str13 = sourceFile9.toString();
        boolean boolean14 = sourceFile9.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        java.lang.String str7 = sourceFile3.getLine((int) (byte) 100);
        java.lang.String str9 = sourceFile3.getLine((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region11 = sourceFile3.getRegion(0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded3.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("hi!");
        preloaded3.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = preloaded3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        int int12 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded3.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        boolean boolean6 = sourceFile3.hasSourceInMemory();
        java.lang.Class<?> wildcardClass7 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        java.lang.String str13 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCodeNoCache();
        java.lang.String str7 = preloaded3.getCode();
        preloaded3.clearCachedSource();
        java.lang.Class<?> wildcardClass9 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        java.lang.String str8 = generated2.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region7 = sourceFile2.getRegion(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        boolean boolean12 = sourceFile9.isExtern();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (short) 10);
        java.lang.String str16 = sourceFile9.getLine((int) '4');
        sourceFile9.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        preloaded3.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = preloaded3.getLineOffset((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("");
        java.lang.String str16 = sourceFile9.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = sourceFile9.getLineOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion(10);
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        java.lang.String str14 = preloaded3.getCodeNoCache();
        java.lang.String str15 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        preloaded2.clearCachedSource();
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        int int11 = preloaded3.getNumLines();
        java.lang.Class<?> wildcardClass12 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile11.setIsExtern(false);
        java.lang.String str14 = sourceFile11.getName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        boolean boolean16 = preloaded3.isExtern();
        java.lang.Class<?> wildcardClass17 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(false);
        java.lang.String str10 = preloaded3.getCode();
        java.lang.String str11 = preloaded3.toString();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getCode();
        java.lang.String str12 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.lang.String str16 = preloaded3.getLine(0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = preloaded3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine(10);
        sourceFile9.setIsExtern(false);
        java.lang.String str15 = sourceFile9.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        java.lang.Class<?> wildcardClass6 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getName();
        java.lang.Class<?> wildcardClass12 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded4.getLine(10);
        preloaded4.clearCachedSource();
        java.lang.String str11 = preloaded4.getLine(100);
        com.google.javascript.jscomp.Region region13 = preloaded4.getRegion((int) ' ');
        java.lang.String str14 = preloaded4.getOriginalPath();
        preloaded4.setOriginalPath("");
        com.google.javascript.jscomp.Region region18 = preloaded4.getRegion((int) '4');
        java.io.Reader reader19 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile20 = com.google.javascript.jscomp.SourceFile.fromReader("", reader19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(region18);
        org.junit.Assert.assertNotNull(reader19);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        boolean boolean3 = sourceFile1.hasSourceInMemory();
        java.lang.String str4 = sourceFile1.getCode();
        boolean boolean5 = sourceFile1.hasSourceInMemory();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        java.lang.String str8 = preloaded3.getCodeNoCache();
        int int9 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        java.lang.String str11 = preloaded4.toString();
        java.io.Reader reader12 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("", reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getCode();
        sourceFile9.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        java.lang.Class<?> wildcardClass9 = preloaded3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = preloaded3.getLineOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getCodeNoCache();
        java.lang.String str4 = preloaded2.toString();
        java.io.Reader reader5 = preloaded2.getCodeReader();
        java.lang.Class<?> wildcardClass6 = reader5.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        sourceFile13.setOriginalPath("hi!");
        java.lang.String str17 = sourceFile13.getLine(100);
        boolean boolean18 = sourceFile13.isExtern();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getName();
        java.lang.Class<?> wildcardClass10 = preloaded3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean4 = preloaded3.hasSourceInMemory();
        java.lang.String str5 = preloaded3.getCode();
        java.io.Reader reader6 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("", reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean8 = generated2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getCode();
        java.lang.String str12 = preloaded3.getCode();
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        boolean boolean6 = preloaded2.hasSourceInMemory();
        preloaded2.setOriginalPath("");
        java.lang.Class<?> wildcardClass9 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        boolean boolean11 = preloaded3.isExtern();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        boolean boolean6 = generated2.isExtern();
        java.lang.String str7 = generated2.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getLine(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded5.clearCachedSource();
        java.lang.String str8 = preloaded5.getLine((int) (byte) -1);
        int int9 = preloaded5.getNumLines();
        java.io.Reader reader10 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("", reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        com.google.javascript.jscomp.Region region5 = preloaded2.getRegion((int) (short) 10);
        java.lang.String str6 = preloaded2.getCodeNoCache();
        java.lang.String str7 = preloaded2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) (short) 0);
        java.lang.String str16 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(region15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.isExtern();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        java.lang.String str13 = sourceFile9.getLine(0);
        int int14 = sourceFile9.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str4 = preloaded3.getOriginalPath();
        int int5 = preloaded3.getNumLines();
        java.lang.String str6 = preloaded3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean11 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = generated2.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getCode();
        int int5 = sourceFile3.getNumLines();
        java.lang.String str6 = sourceFile3.getOriginalPath();
        sourceFile3.setOriginalPath("hi!");
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile2.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.String str5 = sourceFile2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = sourceFile2.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("hi!");
        java.lang.Class<?> wildcardClass14 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine((int) (short) 10);
        java.lang.String str13 = sourceFile9.getCodeNoCache();
        java.lang.String str14 = sourceFile9.getCode();
        sourceFile9.clearCachedSource();
        java.lang.String str17 = sourceFile9.getLine((int) (byte) -1);
        java.io.Reader reader18 = sourceFile9.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(reader18);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) '4');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(region15);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getName();
        java.lang.String str13 = sourceFile9.getName();
        sourceFile9.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "");
        java.lang.String str4 = preloaded3.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region6 = preloaded3.getRegion((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        preloaded3.clearCachedSource();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.lang.String str16 = preloaded3.getLine((int) '#');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        boolean boolean7 = preloaded2.isExtern();
        java.lang.String str8 = preloaded2.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.setIsExtern(false);
        boolean boolean13 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        boolean boolean5 = preloaded2.hasSourceInMemory();
        java.lang.String str6 = preloaded2.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "");
        java.lang.String str4 = preloaded3.getName();
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = preloaded3.getLineOffset((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean5 = sourceFile4.isExtern();
        int int6 = sourceFile4.getNumLines();
        java.io.Reader reader7 = sourceFile4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("", reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(reader7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        int int15 = preloaded3.getNumLines();
        java.lang.String str16 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) ' ');
        preloaded3.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = preloaded3.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        java.lang.String str5 = sourceFile3.toString();
        sourceFile3.clearCachedSource();
        sourceFile3.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = sourceFile3.getLineOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader6 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        java.lang.String str10 = sourceFile9.toString();
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        boolean boolean10 = preloaded6.hasSourceInMemory();
        boolean boolean11 = preloaded6.hasSourceInMemory();
        preloaded6.setOriginalPath("");
        java.io.Reader reader14 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("", reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(sourceFile16);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine((-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        java.lang.String str11 = generated2.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile3.getLineOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        sourceFile13.setOriginalPath("hi!");
        boolean boolean16 = sourceFile13.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region18 = sourceFile13.getRegion((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        java.lang.String str10 = preloaded3.toString();
        java.io.Reader reader11 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = sourceFile9.getLineOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("hi!");
        java.lang.Class<?> wildcardClass11 = preloaded3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("");
        boolean boolean5 = sourceFile1.hasSourceInMemory();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getCode();
        java.lang.String str5 = sourceFile3.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = sourceFile3.getLineOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.String str5 = sourceFile2.getCodeNoCache();
        boolean boolean6 = sourceFile2.isExtern();
        java.lang.String str7 = sourceFile2.getName();
        boolean boolean8 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.isExtern();
        boolean boolean13 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.toString();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        boolean boolean7 = sourceFile2.isExtern();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        preloaded4.setIsExtern(true);
        preloaded4.clearCachedSource();
        java.lang.String str12 = preloaded4.getOriginalPath();
        java.lang.String str14 = preloaded4.getLine((int) (short) 1);
        boolean boolean15 = preloaded4.hasSourceInMemory();
        java.io.Reader reader16 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader16);
        java.lang.Class<?> wildcardClass18 = reader16.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded3.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        java.lang.String str10 = preloaded3.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        boolean boolean7 = preloaded2.hasSourceInMemory();
        java.lang.Class<?> wildcardClass8 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        java.lang.String str6 = preloaded2.getName();
        java.lang.String str8 = preloaded2.getLine(100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded2.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        java.lang.String str12 = generated2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.lang.Class<?> wildcardClass6 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        java.lang.String str13 = preloaded3.getOriginalPath();
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) (short) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(region15);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.getCode();
        java.io.Reader reader10 = preloaded3.getCodeReader();
        java.lang.String str11 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setOriginalPath("hi!");
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) '4');
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region13);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        preloaded2.setOriginalPath("hi!");
        int int11 = preloaded2.getNumLines();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.setIsExtern(false);
        boolean boolean13 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(false);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        preloaded3.setOriginalPath("");
        java.lang.String str13 = preloaded3.getCode();
        int int14 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        boolean boolean14 = sourceFile13.isExtern();
        java.lang.String str15 = sourceFile13.toString();
        java.lang.String str16 = sourceFile13.getCodeNoCache();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        boolean boolean11 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) 'a');
        preloaded3.clearCachedSource();
        java.lang.String str17 = preloaded3.getCodeNoCache();
        boolean boolean18 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNull(region15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str9 = generated2.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion((int) (short) 0);
        boolean boolean9 = preloaded3.hasSourceInMemory();
        int int10 = preloaded3.getNumLines();
        java.lang.Class<?> wildcardClass11 = preloaded3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str10 = preloaded3.getName();
        boolean boolean11 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        int int12 = preloaded3.getNumLines();
        preloaded3.setIsExtern(true);
        java.lang.String str15 = preloaded3.getCodeNoCache();
        java.lang.String str16 = preloaded3.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded3.getLineOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str10 = generated2.getCodeNoCache();
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion(10);
        java.io.Reader reader12 = preloaded3.getCodeReader();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        preloaded4.setIsExtern(true);
        preloaded4.clearCachedSource();
        java.lang.String str12 = preloaded4.getOriginalPath();
        java.lang.String str14 = preloaded4.getLine((int) (short) 1);
        boolean boolean15 = preloaded4.hasSourceInMemory();
        java.io.Reader reader16 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("", reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reader16);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(0);
        java.lang.String str11 = preloaded3.getCodeNoCache();
        int int13 = preloaded3.getLineOffset(1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        java.lang.String str14 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getCode();
        java.io.Reader reader16 = preloaded3.getCodeReader();
        java.lang.String str17 = preloaded3.getName();
        boolean boolean18 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        com.google.javascript.jscomp.Region region5 = preloaded2.getRegion((int) (short) 10);
        java.lang.String str6 = preloaded2.getCodeNoCache();
        java.lang.Class<?> wildcardClass7 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        boolean boolean16 = preloaded3.isExtern();
        int int17 = preloaded3.getNumLines();
        preloaded3.setIsExtern(false);
        java.lang.Class<?> wildcardClass20 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.getCode();
        java.io.Reader reader10 = preloaded3.getCodeReader();
        java.lang.String str11 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str12 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.getName();
        java.lang.String str5 = sourceFile2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = sourceFile2.getLineOffset((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded4.clearCachedSource();
        java.lang.String str7 = preloaded4.getLine((int) (byte) -1);
        int int8 = preloaded4.getNumLines();
        java.io.Reader reader9 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = sourceFile10.getLineOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        java.io.Reader reader9 = sourceFile7.getCodeReader();
        java.lang.String str10 = sourceFile7.getOriginalPath();
        int int11 = sourceFile7.getNumLines();
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean11 = generated2.isExtern();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.getCode();
        java.lang.String str10 = preloaded3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        boolean boolean3 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader4 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromReader("", reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        java.lang.Class<?> wildcardClass15 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion(10);
        java.io.Reader reader12 = preloaded3.getCodeReader();
        java.lang.String str13 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        boolean boolean9 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded3.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion((-1));
        java.lang.String str11 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        boolean boolean7 = sourceFile2.isExtern();
        int int8 = sourceFile2.getNumLines();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        java.lang.String str13 = sourceFile9.getCode();
        com.google.javascript.jscomp.Region region15 = sourceFile9.getRegion((int) (short) 10);
        java.lang.String str17 = sourceFile9.getLine(1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(region15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = region10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        int int9 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        java.lang.String str11 = preloaded3.getLine((int) '4');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader6 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        java.lang.String str9 = sourceFile8.getCode();
        java.io.Reader reader10 = sourceFile8.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("", reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(reader10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        int int14 = preloaded3.getLineOffset((int) (short) 1);
        java.lang.String str15 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int5 = preloaded4.getNumLines();
        java.lang.String str6 = preloaded4.toString();
        int int7 = preloaded4.getNumLines();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.lang.Class<?> wildcardClass15 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        int int12 = preloaded3.getLineOffset((int) (short) 1);
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion((int) ' ');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion(0);
        preloaded3.setOriginalPath("");
        java.lang.String str11 = preloaded3.toString();
        int int12 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        int int9 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getLine(100);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        preloaded4.clearCachedSource();
        java.lang.String str10 = preloaded4.toString();
        com.google.javascript.jscomp.Region region12 = preloaded4.getRegion(10);
        java.io.Reader reader13 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("", reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        boolean boolean16 = preloaded3.isExtern();
        int int17 = preloaded3.getNumLines();
        java.lang.String str18 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        sourceFile3.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region7 = sourceFile3.getRegion((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        preloaded3.setOriginalPath("");
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        java.lang.String str9 = preloaded6.toString();
        int int10 = preloaded6.getNumLines();
        com.google.javascript.jscomp.Region region12 = preloaded6.getRegion((int) '#');
        boolean boolean13 = preloaded6.isExtern();
        boolean boolean14 = preloaded6.isExtern();
        java.lang.String str15 = preloaded6.getOriginalPath();
        java.lang.String str16 = preloaded6.getName();
        java.io.Reader reader17 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader17);
        com.google.javascript.jscomp.SourceFile sourceFile19 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile20 = com.google.javascript.jscomp.SourceFile.fromReader("", reader17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(sourceFile18);
        org.junit.Assert.assertNotNull(sourceFile19);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        java.lang.String str10 = generated2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("");
        java.lang.String str5 = sourceFile1.getCode();
        java.lang.String str6 = sourceFile1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        java.lang.String str12 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded4.clearCachedSource();
        boolean boolean6 = preloaded4.hasSourceInMemory();
        java.lang.String str7 = preloaded4.getName();
        preloaded4.clearCachedSource();
        java.io.Reader reader9 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("", reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(reader9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        java.lang.String str7 = preloaded3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getName();
        boolean boolean4 = preloaded2.hasSourceInMemory();
        int int5 = preloaded2.getNumLines();
        java.lang.String str6 = preloaded2.getCode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        int int9 = preloaded2.getLineOffset((int) (byte) 1);
        java.lang.String str10 = preloaded2.getCode();
        java.lang.Class<?> wildcardClass11 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        int int12 = preloaded3.getLineOffset((int) (short) 1);
        java.lang.String str13 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "hi!");
        int int4 = sourceFile3.getNumLines();
        java.lang.String str5 = sourceFile3.getCodeNoCache();
        boolean boolean6 = sourceFile3.isExtern();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str13 = preloaded3.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = preloaded3.getLineOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str13 = sourceFile11.getLine((int) ' ');
        java.lang.String str15 = sourceFile11.getLine(10);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.clearCachedSource();
        boolean boolean5 = sourceFile3.isExtern();
        sourceFile3.setIsExtern(false);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        java.lang.String str6 = preloaded2.getName();
        java.lang.String str8 = preloaded2.getLine(100);
        preloaded2.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        sourceFile3.setOriginalPath("");
        sourceFile3.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region11 = sourceFile3.getRegion(0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(false);
        preloaded3.setIsExtern(true);
        boolean boolean10 = preloaded3.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded3.getLineOffset((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getOriginalPath();
        com.google.javascript.jscomp.Region region7 = preloaded3.getRegion((int) 'a');
        java.lang.String str8 = preloaded3.getCode();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(region7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        preloaded3.clearCachedSource();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        java.lang.String str9 = preloaded3.getOriginalPath();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        int int12 = preloaded3.getNumLines();
        preloaded3.setIsExtern(true);
        java.lang.String str15 = preloaded3.getCodeNoCache();
        java.lang.String str16 = preloaded3.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader9 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getName();
        java.lang.String str13 = sourceFile9.toString();
        com.google.javascript.jscomp.Region region15 = sourceFile9.getRegion((int) '#');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(region15);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        boolean boolean3 = sourceFile1.isExtern();
        java.lang.Class<?> wildcardClass4 = sourceFile1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean5 = generated2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        sourceFile9.setOriginalPath("hi!");
        int int14 = sourceFile9.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        java.lang.String str8 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getLine(1);
        java.lang.String str14 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("hi!");
        java.lang.String str14 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.lang.String str11 = sourceFile9.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = sourceFile9.getLineOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        sourceFile9.setOriginalPath("hi!");
        boolean boolean12 = sourceFile9.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        java.lang.Class<?> wildcardClass12 = preloaded3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.io.Reader reader15 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = preloaded3.getLineOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reader15);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setIsExtern(true);
        java.lang.String str12 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile11.setIsExtern(false);
        java.io.Reader reader14 = sourceFile11.getCodeReader();
        java.lang.Class<?> wildcardClass15 = sourceFile11.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getCode();
        java.io.Reader reader5 = sourceFile3.getCodeReader();
        java.lang.String str6 = sourceFile3.getName();
        java.io.Reader reader7 = sourceFile3.getCodeReader();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean11 = generated2.isExtern();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        sourceFile1.setIsExtern(false);
        java.lang.String str4 = sourceFile1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.toString();
        java.lang.String str9 = preloaded3.getOriginalPath();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile11.setIsExtern(false);
        java.lang.String str14 = sourceFile11.getCodeNoCache();
        int int15 = sourceFile11.getNumLines();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("");
        sourceFile9.setIsExtern(false);
        sourceFile9.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        boolean boolean5 = sourceFile3.hasSourceInMemory();
        sourceFile3.setIsExtern(true);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        com.google.javascript.jscomp.Region region7 = preloaded3.getRegion(100);
        boolean boolean8 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(region7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        int int11 = sourceFile9.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        java.lang.String str7 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion(0);
        java.lang.String str12 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(region11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getOriginalPath();
        java.lang.String str4 = preloaded2.getOriginalPath();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        java.lang.String str9 = preloaded6.toString();
        int int10 = preloaded6.getNumLines();
        com.google.javascript.jscomp.Region region12 = preloaded6.getRegion((int) '#');
        java.lang.String str13 = preloaded6.toString();
        java.io.Reader reader14 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("", reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(sourceFile16);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.lang.String str8 = preloaded4.getOriginalPath();
        preloaded4.setIsExtern(true);
        com.google.javascript.jscomp.Region region12 = preloaded4.getRegion(10);
        java.io.Reader reader13 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        boolean boolean6 = preloaded2.isExtern();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }
}

