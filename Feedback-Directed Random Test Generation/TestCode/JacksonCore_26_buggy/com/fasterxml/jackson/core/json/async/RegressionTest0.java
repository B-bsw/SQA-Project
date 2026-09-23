package com.fasterxml.jackson.core.json.async;

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
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, 0, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) (byte) 0, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int[] intArray0 = com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._icLatin1;
        java.lang.Class<?> wildcardClass1 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) (short) 0, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) (byte) 10, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, 10, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, 100, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) ' ', byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) 'a', byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) '4', byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) (short) 10, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) (short) 100, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (-1), byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) (byte) 100, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) (byte) 1, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) (byte) -1, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) '#', byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) (short) 1, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, (int) (short) -1, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer byteQuadsCanonicalizer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.core.json.async.NonBlockingJsonParser nonBlockingJsonParser3 = new com.fasterxml.jackson.core.json.async.NonBlockingJsonParser(iOContext0, 1, byteQuadsCanonicalizer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

