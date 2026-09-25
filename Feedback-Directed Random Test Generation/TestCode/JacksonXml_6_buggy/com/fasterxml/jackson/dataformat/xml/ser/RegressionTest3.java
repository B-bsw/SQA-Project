package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (short) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(57343);
        boolean boolean7 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledIn(56320);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        int int19 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        boolean boolean11 = feature0.enabledIn(56319);
        boolean boolean13 = feature0.enabledIn((int) '4');
        int int14 = feature0.getMask();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, (int) (byte) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledIn(1);
        boolean boolean11 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean6 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56320);
        boolean boolean12 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) 'a');
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) 0);
        boolean boolean16 = feature0.enabledIn(1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean12 = feature0.enabledIn(1);
        int int13 = feature0.getMask();
        boolean boolean15 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(10);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(0);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        boolean boolean15 = feature0.enabledByDefault();
        int int16 = feature0.getMask();
        boolean boolean17 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledIn((int) '4');
        boolean boolean9 = feature0.enabledIn((int) '#');
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '#', 57343, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(100);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(0);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(100);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        boolean boolean14 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        boolean boolean11 = feature0.enabledIn((int) '#');
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(10);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn(1);
        boolean boolean15 = feature0.enabledIn((int) (short) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 0, 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        boolean boolean17 = feature0.enabledIn((int) (byte) 100);
        int int18 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        boolean boolean11 = feature0.enabledIn(56319);
        boolean boolean13 = feature0.enabledIn((int) '4');
        int int14 = feature0.getMask();
        boolean boolean15 = feature0.enabledByDefault();
        int int16 = feature0.getMask();
        int int17 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) 'a');
        boolean boolean8 = feature0.enabledIn((int) ' ');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledIn((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean6 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) -1);
        boolean boolean11 = feature0.enabledIn((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 1, (int) (byte) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        boolean boolean12 = feature0.enabledIn((-1));
        int int13 = feature0.getMask();
        boolean boolean15 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (byte) 100);
        boolean boolean7 = feature0.enabledIn((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '#', (int) (short) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) 'a');
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        boolean boolean16 = feature0.enabledIn(100);
        int int17 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledIn((int) '4');
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn((int) (byte) 100);
        boolean boolean7 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        int int17 = feature0.getMask();
        boolean boolean19 = feature0.enabledIn(10);
        int int20 = feature0.getMask();
        java.lang.Class<?> wildcardClass21 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(100);
        boolean boolean12 = feature0.enabledIn((int) (short) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(55296);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) '#');
        boolean boolean4 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(100);
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) -1, (int) ' ', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        boolean boolean16 = feature0.enabledByDefault();
        int int17 = feature0.getMask();
        boolean boolean19 = feature0.enabledIn((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        boolean boolean18 = feature0.enabledByDefault();
        int int19 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        boolean boolean11 = feature0.enabledIn(57343);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(55296);
        boolean boolean6 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        boolean boolean15 = feature0.enabledIn(56319);
        boolean boolean17 = feature0.enabledIn(55296);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        boolean boolean18 = feature0.enabledIn((int) (short) 1);
        int int19 = feature0.getMask();
        boolean boolean20 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass21 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        boolean boolean13 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) '#');
        boolean boolean11 = feature0.enabledIn((int) (byte) 0);
        boolean boolean13 = feature0.enabledIn(2);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        int int13 = feature0.getMask();
        boolean boolean15 = feature0.enabledIn(100);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        boolean boolean18 = feature0.enabledIn((int) '#');
        boolean boolean20 = feature0.enabledIn((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        int int14 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        boolean boolean16 = feature0.enabledIn((int) (byte) -1);
        boolean boolean17 = feature0.enabledByDefault();
        int int18 = feature0.getMask();
        boolean boolean19 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean11 = feature0.enabledIn(100);
        boolean boolean13 = feature0.enabledIn((int) (short) 0);
        int int14 = feature0.getMask();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean12 = feature0.enabledIn(10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', (int) (byte) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(56320);
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        boolean boolean11 = feature0.enabledIn(56319);
        boolean boolean13 = feature0.enabledIn((int) '4');
        int int14 = feature0.getMask();
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledIn(56320);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 1, 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 10, (int) (byte) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean11 = feature0.enabledIn(100);
        boolean boolean13 = feature0.enabledIn((int) '#');
        boolean boolean15 = feature0.enabledIn((-1));
        int int16 = feature0.getMask();
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean9 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(55296);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (short) -1);
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 0);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 55296, (int) (short) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) ' ');
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) '4');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        boolean boolean13 = feature0.enabledIn((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean9 = feature0.enabledIn((int) ' ');
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        boolean boolean13 = feature0.enabledIn((int) (short) 10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        boolean boolean9 = feature0.enabledIn((int) (short) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        boolean boolean16 = feature0.enabledIn(100);
        boolean boolean17 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledIn((int) '4');
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) '4');
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        boolean boolean13 = feature0.enabledIn((int) (short) -1);
        int int14 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        int int13 = feature0.getMask();
        boolean boolean15 = feature0.enabledIn(0);
        boolean boolean16 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 100, (int) (byte) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(56320);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) '#');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(55296);
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledIn((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) -1, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(55296);
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
        int int15 = feature0.getMask();
        boolean boolean16 = feature0.enabledByDefault();
        boolean boolean18 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean10 = feature0.enabledIn((int) ' ');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        boolean boolean14 = feature0.enabledIn((int) (short) 100);
        boolean boolean16 = feature0.enabledIn((int) 'a');
        boolean boolean18 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(1);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) 'a');
        boolean boolean16 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) 0);
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(2);
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (short) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        int int18 = feature0.getMask();
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        boolean boolean16 = feature0.enabledIn((int) (short) 100);
        boolean boolean18 = feature0.enabledIn(0);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(1);
        boolean boolean8 = feature0.enabledIn((int) '#');
        boolean boolean10 = feature0.enabledIn((int) (byte) 100);
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        boolean boolean20 = feature0.enabledIn(57343);
        boolean boolean22 = feature0.enabledIn((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        boolean boolean16 = feature0.enabledIn((int) (short) 100);
        int int17 = feature0.getMask();
        boolean boolean18 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 100, (int) '#', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 10, 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(55296);
        boolean boolean6 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledIn((int) '4');
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(55296);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn((int) '4');
        int int14 = feature0.getMask();
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(10);
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
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        boolean boolean17 = feature0.enabledIn(57343);
        boolean boolean19 = feature0.enabledIn((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(10);
        boolean boolean8 = feature0.enabledIn(100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) -1);
        boolean boolean7 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(0);
        int int14 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        boolean boolean17 = feature0.enabledByDefault();
        boolean boolean19 = feature0.enabledIn((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        boolean boolean18 = feature0.enabledIn((int) (short) 1);
        boolean boolean19 = feature0.enabledByDefault();
        int int20 = feature0.getMask();
        java.lang.Class<?> wildcardClass21 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean6 = feature0.enabledIn((int) (short) 100);
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        boolean boolean13 = feature0.enabledIn((int) (short) 0);
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 0, (int) (short) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56319);
        int int14 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn(55296);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledIn(10);
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledIn(2);
        boolean boolean18 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledIn(57343);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn((-1));
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        boolean boolean12 = feature0.enabledIn(0);
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
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn((int) (byte) 100);
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
        int int16 = feature0.getMask();
        boolean boolean18 = feature0.enabledIn(100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        int int18 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn(56320);
        boolean boolean11 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        boolean boolean18 = feature0.enabledIn(56319);
        int int19 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (byte) 10);
        boolean boolean11 = feature0.enabledIn((int) (short) 10);
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 1, (int) (short) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(10);
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (short) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        boolean boolean19 = feature0.enabledByDefault();
        boolean boolean20 = feature0.enabledByDefault();
        boolean boolean21 = feature0.enabledByDefault();
        boolean boolean23 = feature0.enabledIn((int) '#');
        int int24 = feature0.getMask();
        java.lang.Class<?> wildcardClass25 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) 10);
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(0);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(0);
        int int14 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        boolean boolean15 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) -1, 56320, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        boolean boolean13 = feature0.enabledByDefault();
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn(0);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '#', 2, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(56319);
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(100);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        boolean boolean16 = feature0.enabledIn(100);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (short) 100);
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        boolean boolean11 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        boolean boolean17 = feature0.enabledIn((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(55296);
        boolean boolean6 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledIn((int) '4');
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((-1));
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(10);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) '#');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((int) (byte) 10);
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean6 = feature0.enabledIn(100);
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) -1);
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        boolean boolean17 = feature0.enabledIn((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(10);
        boolean boolean13 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean10 = feature0.enabledIn(56320);
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean1 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) ' ', (int) (short) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) 'a');
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        boolean boolean22 = feature0.enabledIn((int) '4');
        int int23 = feature0.getMask();
        boolean boolean25 = feature0.enabledIn((int) 'a');
        int int26 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn(57343);
        int int16 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean11 = feature0.enabledIn(100);
        boolean boolean13 = feature0.enabledIn((int) (short) 0);
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        boolean boolean18 = feature0.enabledIn((int) ' ');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        int int17 = feature0.getMask();
        boolean boolean19 = feature0.enabledIn(10);
        boolean boolean21 = feature0.enabledIn((int) '4');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn((int) (short) -1);
        boolean boolean17 = feature0.enabledByDefault();
        int int18 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn((int) (byte) 100);
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
        int int16 = feature0.getMask();
        boolean boolean17 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        boolean boolean15 = feature0.enabledIn(56319);
        boolean boolean17 = feature0.enabledIn(56320);
        boolean boolean18 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) ' ');
        boolean boolean12 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        boolean boolean9 = feature0.enabledIn(55296);
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(55296);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 1, (int) (byte) 0, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56320);
        boolean boolean12 = feature0.enabledIn((int) ' ');
        int int13 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        boolean boolean17 = feature0.enabledByDefault();
        boolean boolean18 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(1);
        boolean boolean12 = feature0.enabledIn((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 10, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        boolean boolean19 = feature0.enabledIn((int) (short) 1);
        boolean boolean21 = feature0.enabledIn(1);
        int int22 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) ' ');
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean6 = feature0.enabledIn(100);
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn(57343);
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) '#');
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 100);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) ' ');
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn(1);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 10, 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        boolean boolean16 = feature0.enabledIn(2);
        boolean boolean18 = feature0.enabledIn(2);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        boolean boolean10 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledIn(55296);
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(100);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) '4');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledIn(57343);
        int int15 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(2);
        boolean boolean7 = feature0.enabledIn((int) (byte) -1);
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        boolean boolean11 = feature0.enabledIn(1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 100, (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        boolean boolean5 = feature0.enabledIn(57343);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(1);
        boolean boolean10 = feature0.enabledIn((int) '#');
        boolean boolean12 = feature0.enabledIn((-1));
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        int int17 = feature0.getMask();
        java.lang.Class<?> wildcardClass18 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) -1, (int) (byte) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (byte) 100);
        boolean boolean6 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        boolean boolean17 = feature0.enabledIn((int) (byte) 100);
        boolean boolean19 = feature0.enabledIn((int) (byte) 100);
        boolean boolean20 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass21 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean9 = feature0.enabledIn((-1));
        boolean boolean11 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn((int) (byte) 100);
        int int17 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) '4');
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        boolean boolean11 = feature0.enabledIn((int) '4');
        int int12 = feature0.getMask();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(57343);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(56320);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) '4');
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((-1));
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn(0);
        int int14 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledIn(10);
        boolean boolean15 = feature0.enabledByDefault();
        int int16 = feature0.getMask();
        boolean boolean17 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass18 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean6 = feature0.enabledIn((int) (short) 100);
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        boolean boolean10 = feature0.enabledIn((-1));
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(0);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(0);
        boolean boolean15 = feature0.enabledIn(56320);
        int int16 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean11 = feature0.enabledIn(100);
        boolean boolean13 = feature0.enabledIn((int) (short) 0);
        boolean boolean15 = feature0.enabledIn(56319);
        boolean boolean17 = feature0.enabledIn((int) (short) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(2);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) ' ');
        boolean boolean12 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        boolean boolean20 = feature0.enabledIn(2);
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
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(0);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(0);
        boolean boolean15 = feature0.enabledIn(56319);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean4 = feature0.enabledIn(100);
        boolean boolean6 = feature0.enabledIn(10);
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) '#');
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) '4');
        boolean boolean12 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn(2);
        boolean boolean4 = feature0.enabledIn((int) (short) 1);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (short) 10);
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        int int16 = feature0.getMask();
        int int17 = feature0.getMask();
        boolean boolean18 = feature0.enabledByDefault();
        boolean boolean20 = feature0.enabledIn((int) 'a');
        boolean boolean22 = feature0.enabledIn((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 100, (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) '4');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        boolean boolean14 = feature0.enabledIn(1);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((-1));
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
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) ' ');
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
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn(1);
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn((int) (byte) 100);
        boolean boolean7 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        boolean boolean15 = feature0.enabledIn(57343);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        int int20 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(10);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (short) 10);
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn((int) '#');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn(56319);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean10 = feature0.enabledIn(57343);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        boolean boolean12 = feature0.enabledIn((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        boolean boolean19 = feature0.enabledByDefault();
        boolean boolean20 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        boolean boolean12 = feature0.enabledIn(10);
        boolean boolean14 = feature0.enabledIn(2);
        boolean boolean16 = feature0.enabledIn((int) (short) 1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        boolean boolean13 = feature0.enabledIn((int) ' ');
        boolean boolean15 = feature0.enabledIn(56319);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
        boolean boolean15 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn(1);
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 57343, (int) (short) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        boolean boolean13 = feature0.enabledByDefault();
        int int14 = feature0.getMask();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(1);
        int int10 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        boolean boolean13 = feature0.enabledIn((int) (short) -1);
        boolean boolean15 = feature0.enabledIn((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(100);
        boolean boolean13 = feature0.enabledIn(57343);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        int int14 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn((int) (short) 100);
        int int14 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        boolean boolean17 = feature0.enabledIn((int) (byte) 10);
        boolean boolean19 = feature0.enabledIn((int) (byte) 10);
        boolean boolean20 = feature0.enabledByDefault();
        boolean boolean21 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
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
        boolean boolean13 = feature0.enabledIn(56320);
        int int14 = feature0.getMask();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        boolean boolean17 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) '#');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) '#');
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        boolean boolean10 = feature0.enabledIn(100);
        boolean boolean12 = feature0.enabledIn((int) '4');
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        int int12 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        boolean boolean19 = feature0.enabledByDefault();
        int int20 = feature0.getMask();
        java.lang.Class<?> wildcardClass21 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn((int) (byte) 100);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        boolean boolean17 = feature0.enabledIn(1);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (byte) 100);
        boolean boolean7 = feature0.enabledIn((int) (short) -1);
        boolean boolean9 = feature0.enabledIn(2);
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean9 = feature0.enabledIn(56320);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(56319);
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean9 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        boolean boolean20 = feature0.enabledByDefault();
        boolean boolean22 = feature0.enabledIn(10);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        int int17 = feature0.getMask();
        boolean boolean19 = feature0.enabledIn(10);
        int int20 = feature0.getMask();
        boolean boolean22 = feature0.enabledIn((int) 'a');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(1);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(10);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(57343);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(56319);
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn(56320);
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn((int) (byte) 100);
        int int14 = feature0.getMask();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        boolean boolean17 = feature0.enabledIn(56319);
        int int18 = feature0.getMask();
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean9 = feature0.enabledIn((int) ' ');
        boolean boolean11 = feature0.enabledIn(0);
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        boolean boolean14 = feature0.enabledByDefault();
        int int15 = feature0.getMask();
        boolean boolean16 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((-1));
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        int int10 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledIn(10);
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledByDefault();
        boolean boolean18 = feature0.enabledIn((int) (short) 10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(56320);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn((int) (short) 1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn((int) '4');
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledIn(10);
        boolean boolean15 = feature0.enabledByDefault();
        int int16 = feature0.getMask();
        boolean boolean17 = feature0.enabledByDefault();
        int int18 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) 'a');
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        boolean boolean16 = feature0.enabledIn((int) (short) 0);
        int int17 = feature0.getMask();
        boolean boolean18 = feature0.enabledByDefault();
        int int19 = feature0.getMask();
        boolean boolean21 = feature0.enabledIn((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        int int13 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(1);
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 0);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn(2);
        boolean boolean18 = feature0.enabledIn((-1));
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) ' ');
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(0);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        boolean boolean21 = feature0.enabledIn((int) (short) -1);
        boolean boolean23 = feature0.enabledIn((int) (byte) 10);
        int int24 = feature0.getMask();
        java.lang.Class<?> wildcardClass25 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(56320);
        boolean boolean13 = feature0.enabledIn(55296);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) 10);
        boolean boolean13 = feature0.enabledIn(56320);
        boolean boolean15 = feature0.enabledIn(56319);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean6 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(1);
        boolean boolean8 = feature0.enabledIn((int) '#');
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        int int13 = feature0.getMask();
        boolean boolean15 = feature0.enabledIn((int) '#');
        boolean boolean16 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((int) (short) 0);
        int int13 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        int int14 = feature0.getMask();
        boolean boolean15 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn(0);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        boolean boolean17 = feature0.enabledIn(0);
        boolean boolean18 = feature0.enabledByDefault();
        boolean boolean19 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) ' ');
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn((int) '#');
        boolean boolean14 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(10);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledIn((-1));
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledIn((int) 'a');
        boolean boolean18 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (short) 100);
        boolean boolean16 = feature0.enabledIn((int) (short) 10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        boolean boolean17 = feature0.enabledIn((int) (byte) 10);
        boolean boolean19 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        boolean boolean20 = feature0.enabledIn((-1));
        int int21 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledIn(10);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) '4');
        int int12 = feature0.getMask();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        boolean boolean14 = feature0.enabledIn((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        boolean boolean15 = feature0.enabledIn(56319);
        boolean boolean17 = feature0.enabledIn((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        boolean boolean15 = feature0.enabledIn((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledIn(0);
        boolean boolean18 = feature0.enabledIn(10);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(2);
        boolean boolean7 = feature0.enabledIn((int) (byte) -1);
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) '4');
        boolean boolean13 = feature0.enabledIn((int) 'a');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(55296);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(0);
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        boolean boolean15 = feature0.enabledIn((int) (byte) 100);
        int int16 = feature0.getMask();
        boolean boolean18 = feature0.enabledIn((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        boolean boolean12 = feature0.enabledIn(2);
        int int13 = feature0.getMask();
        boolean boolean15 = feature0.enabledIn((int) '#');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        boolean boolean16 = feature0.enabledIn((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn(0);
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        boolean boolean17 = feature0.enabledByDefault();
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
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        boolean boolean15 = feature0.enabledIn(0);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        boolean boolean12 = feature0.enabledIn((-1));
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledIn((int) (byte) 10);
        boolean boolean18 = feature0.enabledByDefault();
        boolean boolean20 = feature0.enabledIn(57343);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(1);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 100, (int) (short) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(55296);
        boolean boolean6 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledIn((int) '4');
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(0);
        int int12 = feature0.getMask();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) 'a');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        boolean boolean10 = feature0.enabledIn((int) (short) 0);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        boolean boolean14 = feature0.enabledIn(55296);
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56320);
        boolean boolean12 = feature0.enabledIn((int) ' ');
        int int13 = feature0.getMask();
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        boolean boolean16 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        int int14 = feature0.getMask();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(100);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        boolean boolean18 = feature0.enabledIn((int) (byte) 10);
        int int19 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(56319);
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) -1);
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(2);
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledIn((int) '4');
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn((int) '4');
        boolean boolean16 = feature0.enabledByDefault();
        int int17 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        boolean boolean14 = feature0.enabledIn(55296);
        boolean boolean16 = feature0.enabledIn(10);
        boolean boolean17 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        boolean boolean17 = feature0.enabledIn(56319);
        boolean boolean19 = feature0.enabledIn(56320);
        boolean boolean20 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        boolean boolean17 = feature0.enabledIn((int) (byte) 1);
        boolean boolean18 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn((int) (byte) 100);
        int int10 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        boolean boolean17 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass18 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) ' ');
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) 'a');
        boolean boolean6 = feature0.enabledIn((int) (short) 10);
        int int7 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(10);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(57343);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        boolean boolean16 = feature0.enabledIn(56319);
        int int17 = feature0.getMask();
        boolean boolean18 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(56320);
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        boolean boolean13 = feature0.enabledIn((int) ' ');
        boolean boolean15 = feature0.enabledIn(56319);
        boolean boolean16 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass18 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 0, (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn((int) 'a');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        boolean boolean14 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) -1, (int) (byte) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        boolean boolean11 = feature0.enabledIn((int) (short) 10);
        boolean boolean13 = feature0.enabledIn((int) (byte) 0);
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledIn(55296);
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean12 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) ' ');
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(0);
        int int13 = feature0.getMask();
        boolean boolean15 = feature0.enabledIn((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledIn((int) '4');
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean6 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (byte) 100);
        boolean boolean7 = feature0.enabledIn((int) (short) -1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(56319);
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        boolean boolean18 = feature0.enabledByDefault();
        boolean boolean20 = feature0.enabledIn(57343);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean8 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        boolean boolean5 = feature0.enabledIn((int) (byte) 1);
        boolean boolean6 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn(100);
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(1);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        boolean boolean19 = feature0.enabledByDefault();
        boolean boolean21 = feature0.enabledIn((int) (byte) 10);
        boolean boolean23 = feature0.enabledIn(56319);
        java.lang.Class<?> wildcardClass24 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        int int14 = feature0.getMask();
        boolean boolean15 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) 'a');
        boolean boolean10 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 0);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
        int int15 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        boolean boolean12 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) '#');
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) ' ');
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(57343);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn(0);
        boolean boolean15 = feature0.enabledByDefault();
        int int16 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(2);
        boolean boolean7 = feature0.enabledIn((int) (byte) -1);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledIn((int) '4');
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        int int14 = feature0.getMask();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        boolean boolean17 = feature0.enabledIn((int) (byte) 100);
        boolean boolean19 = feature0.enabledIn((int) (byte) 100);
        boolean boolean20 = feature0.enabledByDefault();
        boolean boolean22 = feature0.enabledIn(56320);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(0);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 1);
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledIn((int) (short) 100);
        int int10 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(0);
        boolean boolean13 = feature0.enabledIn(2);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (short) -1);
        boolean boolean9 = feature0.enabledIn((int) '#');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) '4');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        boolean boolean14 = feature0.enabledIn(55296);
        boolean boolean16 = feature0.enabledIn(10);
        boolean boolean18 = feature0.enabledIn((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) ' ');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn((int) (short) 0);
        boolean boolean13 = feature0.enabledIn(100);
        boolean boolean15 = feature0.enabledIn(10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) '#');
        boolean boolean11 = feature0.enabledIn((int) '#');
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) 10);
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn((int) (byte) 100);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(100);
        boolean boolean14 = feature0.enabledIn(2);
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 100, (int) (byte) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) -1);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        boolean boolean10 = feature0.enabledIn((-1));
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn((int) (byte) -1);
        int int14 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn(100);
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(1);
        boolean boolean6 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(0);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        boolean boolean14 = feature0.enabledIn((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) '#');
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        int int12 = feature0.getMask();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

