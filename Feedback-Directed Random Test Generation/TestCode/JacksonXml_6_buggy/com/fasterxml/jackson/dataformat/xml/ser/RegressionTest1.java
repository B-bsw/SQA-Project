package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 100, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) 0);
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass18 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) '4');
        boolean boolean13 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 1, (int) (short) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        boolean boolean10 = feature0.enabledIn(57343);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 1, (int) '#', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 1, (int) '4', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '#', (int) (short) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) 0);
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 1, 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(2);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 10, (int) '4', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', (int) (byte) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) -1, 55296, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56319);
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        boolean boolean17 = feature0.enabledByDefault();
        boolean boolean18 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(55296);
        int int15 = feature0.getMask();
        boolean boolean16 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass18 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(1);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 0, (int) (short) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(2);
        boolean boolean14 = feature0.enabledIn(57343);
        boolean boolean16 = feature0.enabledIn(1);
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 10, 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(57343);
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) ' ');
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 1, (int) (short) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 10, (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56320, (int) '4', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56320, 55296, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) -1, (int) (byte) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) '#');
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(0);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) -1);
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 0, (int) (byte) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((-1));
        boolean boolean12 = feature0.enabledIn(57343);
        int int13 = feature0.getMask();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 1, (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) ' ');
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56319);
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn((int) '4');
        int int17 = feature0.getMask();
        boolean boolean18 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (-1), 57343, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(57343);
        boolean boolean7 = feature0.enabledIn((int) '4');
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 1, 2, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean3 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass4 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 10, (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 100, (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        boolean boolean9 = feature0.enabledIn(100);
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(2);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 10, (int) '#', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56320, (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', 56320, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '4', (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) -1, 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 0, 2, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56320);
        int int14 = feature0.getMask();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, 55296, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '#', 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56320, (int) (short) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(55296);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledIn(1);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) ' ');
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 1, 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 100);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) ' ', (int) '#', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(100);
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn(55296);
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn(56320);
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '#', (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) 'a');
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean12 = feature0.enabledIn((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        boolean boolean12 = feature0.enabledIn((int) (short) 100);
        boolean boolean14 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 100, (int) (byte) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '4', (int) (short) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 100, 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (short) 0);
        boolean boolean13 = feature0.enabledIn((-1));
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(1);
        boolean boolean15 = feature0.enabledIn(55296);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) ' ');
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 10, (int) (short) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 57343, 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) 10);
        boolean boolean13 = feature0.enabledIn(1);
        boolean boolean14 = feature0.enabledByDefault();
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '4', 57343, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 100, 2, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledIn((int) '4');
        java.lang.Class<?> wildcardClass4 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) '4');
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(1);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, (int) (byte) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) ' ');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '4', 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 10, 56320, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) ' ');
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        int int13 = feature0.getMask();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean6 = feature0.enabledIn((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', (int) (short) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(2);
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) -1, (int) (byte) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        java.lang.Class<?> wildcardClass4 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 10, (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 100);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(100);
        int int13 = feature0.getMask();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(55296);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56319);
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn((int) '4');
        int int17 = feature0.getMask();
        int int18 = feature0.getMask();
        boolean boolean20 = feature0.enabledIn((int) (byte) 100);
        boolean boolean21 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        boolean boolean12 = feature0.enabledIn(2);
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(0);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) 'a');
        boolean boolean12 = feature0.enabledIn((int) '4');
        boolean boolean14 = feature0.enabledIn((int) (short) 1);
        int int15 = feature0.getMask();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (short) 0);
        int int12 = feature0.getMask();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 1, (int) (byte) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn(1);
        boolean boolean14 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 10, (int) (byte) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((int) '#');
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) -1, (int) (byte) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (short) 100);
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledIn(55296);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56320);
        boolean boolean15 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56319);
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        boolean boolean18 = feature0.enabledIn((int) '4');
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56319);
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn((int) '4');
        boolean boolean17 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass18 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) ' ');
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn(0);
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56319);
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn((int) '4');
        int int17 = feature0.getMask();
        boolean boolean19 = feature0.enabledIn((int) (short) 10);
        java.lang.Class<?> wildcardClass20 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 10, (int) (byte) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn(0);
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 100, (int) (short) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 100, 57343, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) ' ');
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        boolean boolean5 = feature0.enabledIn(57343);
        boolean boolean7 = feature0.enabledIn((int) (byte) -1);
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) 'a');
        boolean boolean12 = feature0.enabledIn((int) '4');
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) '#');
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 0);
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledIn((int) '4');
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 57343, (int) (short) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) '#');
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 100, (int) (byte) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 1, (int) '#', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 0, (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn(0);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 2, (int) '4', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 57343, (int) (byte) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(2);
        boolean boolean14 = feature0.enabledIn(57343);
        boolean boolean16 = feature0.enabledIn((int) (byte) 1);
        boolean boolean17 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(100);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 55296, 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(1);
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 10, (int) '4', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(10);
        boolean boolean13 = feature0.enabledIn((int) (short) 1);
        boolean boolean15 = feature0.enabledIn((int) '#');
        boolean boolean16 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 100, (int) (byte) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        boolean boolean10 = feature0.enabledIn((int) (short) 0);
        boolean boolean12 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) ' ', (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 100, (int) (byte) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(10);
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (byte) 100);
        boolean boolean5 = feature0.enabledIn((int) ' ');
        boolean boolean6 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(56320);
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean12 = feature0.enabledIn((int) (byte) 1);
        boolean boolean14 = feature0.enabledIn((int) '4');
        boolean boolean16 = feature0.enabledIn(57343);
        boolean boolean18 = feature0.enabledIn((int) (byte) 0);
        int int19 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((-1));
        boolean boolean14 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(10);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) 'a');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 0, (int) (byte) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn(1);
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(2);
        boolean boolean14 = feature0.enabledIn(57343);
        boolean boolean16 = feature0.enabledIn((int) (byte) 1);
        int int17 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((-1));
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 10, 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 10, 2, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 0, (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledIn((int) '#');
        boolean boolean10 = feature0.enabledIn(2);
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 10, (int) (short) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 10, 55296, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(2);
        int int12 = feature0.getMask();
        int int13 = feature0.getMask();
        int int14 = feature0.getMask();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, (int) '4', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) '#');
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        boolean boolean10 = feature0.enabledIn(100);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(10);
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn(1);
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledIn(57343);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) 'a');
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass3 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) 0);
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledIn(56320);
        boolean boolean19 = feature0.enabledIn((int) '#');
        boolean boolean20 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass21 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 100, 57343, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 100);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(100);
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 55296, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 0, (int) ' ', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn(56320);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 1, (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(57343);
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        java.lang.Class<?> wildcardClass4 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, (int) (short) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((-1));
        int int10 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) 'a');
        boolean boolean12 = feature0.enabledIn((int) '4');
        boolean boolean14 = feature0.enabledIn((int) (short) 1);
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        int int17 = feature0.getMask();
        int int18 = feature0.getMask();
        boolean boolean20 = feature0.enabledIn((int) '4');
        java.lang.Class<?> wildcardClass21 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 10, (int) (short) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(100);
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean6 = feature0.enabledIn((int) (short) 100);
        boolean boolean8 = feature0.enabledIn(56320);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) ' ');
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 0, 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 1, (int) (byte) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56319);
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn((int) '4');
        int int17 = feature0.getMask();
        int int18 = feature0.getMask();
        boolean boolean19 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(56320);
        int int15 = feature0.getMask();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 1, (int) '4', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (byte) 100);
        boolean boolean7 = feature0.enabledIn((int) (short) -1);
        boolean boolean9 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 1);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn((int) (short) 1);
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) 'a');
        boolean boolean12 = feature0.enabledIn((int) '4');
        boolean boolean14 = feature0.enabledIn((int) (short) 1);
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        boolean boolean17 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '4', (int) (byte) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        boolean boolean11 = feature0.enabledIn((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(1);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 0, 57343, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((int) (short) -1);
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
        int int15 = feature0.getMask();
        boolean boolean16 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56320);
        boolean boolean12 = feature0.enabledIn((int) ' ');
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass4 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        boolean boolean11 = feature0.enabledIn(56319);
        boolean boolean13 = feature0.enabledIn((int) '4');
        boolean boolean14 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 1, (int) ' ', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 2, (int) (short) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 1, (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(55296);
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        boolean boolean18 = feature0.enabledIn((int) ' ');
        int int19 = feature0.getMask();
        java.lang.Class<?> wildcardClass20 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean12 = feature0.enabledIn((int) (byte) 1);
        boolean boolean14 = feature0.enabledIn((int) '4');
        boolean boolean16 = feature0.enabledIn(57343);
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 10, (int) (byte) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(100);
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 0, 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(57343);
        boolean boolean7 = feature0.enabledIn((int) '4');
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn(55296);
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn((int) (short) 0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 55296, (int) (byte) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 10, (int) (short) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn(1);
        java.lang.Class<?> wildcardClass3 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) '#');
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) 'a');
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) '#');
        boolean boolean11 = feature0.enabledIn((int) (byte) 0);
        boolean boolean13 = feature0.enabledIn((int) (short) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((int) (short) 100);
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56320, (int) (byte) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 55296, (int) (short) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56320, 57343, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 0, (int) (byte) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 0, (int) (short) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((-1));
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 1);
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        boolean boolean10 = feature0.enabledIn((int) (short) 0);
        boolean boolean12 = feature0.enabledIn((int) (byte) 10);
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(55296);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        int int13 = feature0.getMask();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(10);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) -1);
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        boolean boolean18 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 1, (int) (byte) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 10, (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) 10);
        boolean boolean13 = feature0.enabledIn(1);
        boolean boolean14 = feature0.enabledByDefault();
        int int15 = feature0.getMask();
        boolean boolean17 = feature0.enabledIn((int) ' ');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) -1, (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 10, (int) (byte) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 100, (int) (short) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((int) (short) 100);
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn(56319);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 57343, (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 55296, 56320, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) 'a');
        boolean boolean12 = feature0.enabledIn((int) '4');
        boolean boolean14 = feature0.enabledIn((int) (short) 1);
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        boolean boolean18 = feature0.enabledIn((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 1, (int) '4', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) '4');
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((-1));
        boolean boolean16 = feature0.enabledIn(56319);
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(55296);
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((-1));
        boolean boolean8 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        boolean boolean10 = feature0.enabledIn(57343);
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) 'a');
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(2);
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(55296);
        boolean boolean16 = feature0.enabledIn(100);
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(2);
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) 'a');
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        boolean boolean9 = feature0.enabledIn(100);
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(56319);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 57343, (int) '4', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '4', (int) (short) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(2);
        boolean boolean14 = feature0.enabledIn(57343);
        boolean boolean16 = feature0.enabledIn((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        boolean boolean12 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) -1, 55296, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 1, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) -1, (int) (short) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) '#');
        boolean boolean11 = feature0.enabledIn((int) (byte) 0);
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56320);
        boolean boolean12 = feature0.enabledIn((int) ' ');
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) ' ');
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        java.lang.Class<?> wildcardClass4 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 0, 2, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) ' ');
        boolean boolean13 = feature0.enabledIn(2);
        boolean boolean15 = feature0.enabledIn((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) ' ');
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) ' ', (int) ' ', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        boolean boolean12 = feature0.enabledIn((int) (short) 100);
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((-1));
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean13 = feature0.enabledByDefault();
        int int14 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledIn(10);
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean8 = feature0.enabledIn(10);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) ' ');
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) -1);
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, (int) (short) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn(55296);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 0);
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        boolean boolean13 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn(2);
        boolean boolean4 = feature0.enabledIn((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 100, 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn((int) ' ');
        boolean boolean14 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 1, (int) (byte) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) -1, 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 0);
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        int int12 = feature0.getMask();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((-1));
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass18 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        boolean boolean12 = feature0.enabledIn(2);
        boolean boolean13 = feature0.enabledByDefault();
        int int14 = feature0.getMask();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 57343, (int) (short) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(0);
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 57343, 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56320);
        boolean boolean15 = feature0.enabledIn((int) (byte) 100);
        boolean boolean17 = feature0.enabledIn((int) (byte) 10);
        boolean boolean19 = feature0.enabledIn((int) (byte) 100);
        boolean boolean20 = feature0.enabledByDefault();
        boolean boolean21 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass22 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn(1);
        boolean boolean11 = feature0.enabledIn((int) ' ');
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((-1));
        boolean boolean8 = feature0.enabledIn(56320);
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean12 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (short) 0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn((int) (short) 100);
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 10, (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56319);
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn(55296);
        boolean boolean18 = feature0.enabledIn((int) '#');
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) 'a');
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledIn((int) '4');
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(57343);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 10, (int) (byte) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        int int10 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(10);
        boolean boolean12 = feature0.enabledIn((int) (byte) -1);
        boolean boolean14 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 55296, 55296, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 2, 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean8 = feature0.enabledIn(10);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) ' ');
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 0, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 10, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56320, (int) (byte) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) 0);
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledIn(56320);
        boolean boolean18 = feature0.enabledByDefault();
        boolean boolean19 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass20 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) 0);
        boolean boolean15 = feature0.enabledByDefault();
        int int16 = feature0.getMask();
        int int17 = feature0.getMask();
        java.lang.Class<?> wildcardClass18 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        boolean boolean10 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(1);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn((int) (short) 10);
        boolean boolean15 = feature0.enabledIn((int) (byte) 1);
        boolean boolean16 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledIn(55296);
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(55296);
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn((-1));
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(57343);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 100, 55296, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean8 = feature0.enabledIn((int) 'a');
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 0, 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 0, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        boolean boolean10 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) -1, (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn((int) '#');
        int int15 = feature0.getMask();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 2, (int) (short) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn(56319);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledIn(10);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) '4');
        boolean boolean13 = feature0.enabledIn((int) (byte) 1);
        int int14 = feature0.getMask();
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledIn((int) '#');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) -1, (int) '#', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) -1);
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        boolean boolean18 = feature0.enabledIn(55296);
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 1);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) '#');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((-1));
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 1, 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledIn(55296);
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean12 = feature0.enabledIn((int) (short) -1);
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) ' ');
        int int5 = feature0.getMask();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 1, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((int) ' ');
        int int13 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(0);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn(2);
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56320, 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56320);
        boolean boolean15 = feature0.enabledIn((int) (byte) -1);
        boolean boolean17 = feature0.enabledIn((int) (short) 0);
        boolean boolean19 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass20 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

