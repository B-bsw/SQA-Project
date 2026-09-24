package com.fasterxml.jackson.dataformat.xml.ser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        boolean boolean14 = feature0.enabledIn(56320);
        boolean boolean15 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        boolean boolean21 = feature0.enabledIn((int) '4');
        boolean boolean23 = feature0.enabledIn(56319);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        boolean boolean14 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        int int13 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 1, (int) (short) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        boolean boolean14 = feature0.enabledIn(1);
        boolean boolean16 = feature0.enabledIn(57343);
        boolean boolean18 = feature0.enabledIn(1);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) '#');
        boolean boolean11 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        boolean boolean10 = feature0.enabledIn((-1));
        boolean boolean12 = feature0.enabledIn((int) (short) 0);
        int int13 = feature0.getMask();
        boolean boolean15 = feature0.enabledIn((int) (byte) -1);
        boolean boolean17 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) '#');
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(56319);
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(10);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledIn((int) '#');
        boolean boolean10 = feature0.enabledIn(0);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn(1);
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn(0);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        boolean boolean20 = feature0.enabledIn((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        boolean boolean14 = feature0.enabledIn((int) (short) 0);
        int int15 = feature0.getMask();
        boolean boolean16 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn((int) (short) 1);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        java.lang.Class<?> wildcardClass20 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) ' ');
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) -1);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledIn((int) '#');
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) 1);
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 1, (int) 'a', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) 100);
        boolean boolean13 = feature0.enabledIn((int) (byte) 1);
        boolean boolean15 = feature0.enabledIn((int) (short) 1);
        boolean boolean16 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        int int12 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56320, (int) ' ', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) '#');
        boolean boolean11 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) 'a');
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) 100);
        int int12 = feature0.getMask();
        int int13 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((-1));
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(56319);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 10, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledIn((int) '4');
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn(10);
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) ' ');
        boolean boolean12 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        boolean boolean14 = feature0.enabledIn((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        boolean boolean15 = feature0.enabledIn((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        int int22 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        boolean boolean15 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn((int) (byte) 100);
        int int7 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 100);
        boolean boolean12 = feature0.enabledIn((-1));
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean12 = feature0.enabledIn(100);
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledByDefault();
        int int15 = feature0.getMask();
        boolean boolean16 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        boolean boolean15 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean12 = feature0.enabledIn((int) (byte) 1);
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (short) 0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(55296);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        boolean boolean14 = feature0.enabledIn((int) (short) 0);
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 100);
        boolean boolean12 = feature0.enabledIn((int) '4');
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        boolean boolean19 = feature0.enabledIn((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) -1);
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        boolean boolean13 = feature0.enabledIn(56319);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledIn((int) '#');
        boolean boolean10 = feature0.enabledIn(0);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn(1);
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn(2);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledIn((int) '#');
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(10);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        boolean boolean17 = feature0.enabledByDefault();
        int int18 = feature0.getMask();
        boolean boolean19 = feature0.enabledByDefault();
        int int20 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        boolean boolean11 = feature0.enabledIn(56319);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) ' ');
        boolean boolean12 = feature0.enabledIn(57343);
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        boolean boolean13 = feature0.enabledIn((int) ' ');
        int int14 = feature0.getMask();
        boolean boolean15 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        boolean boolean13 = feature0.enabledIn(56320);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        boolean boolean24 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        boolean boolean13 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledByDefault();
        int int17 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', (int) (short) 100, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledIn(2);
        int int17 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        boolean boolean16 = feature0.enabledIn((int) 'a');
        boolean boolean18 = feature0.enabledIn((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        int int14 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        boolean boolean15 = feature0.enabledIn((int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn(2);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        boolean boolean16 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        boolean boolean19 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass20 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(2);
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 0);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean8 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        boolean boolean14 = feature0.enabledIn((int) (short) 10);
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn((int) 'a');
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', (int) (short) 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        boolean boolean17 = feature0.enabledIn((int) 'a');
        boolean boolean19 = feature0.enabledIn(0);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn(56320);
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
        boolean boolean15 = feature0.enabledIn((int) (short) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        boolean boolean14 = feature0.enabledIn(100);
        boolean boolean16 = feature0.enabledIn(2);
        int int17 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) (short) 100);
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
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56320, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean10 = feature0.enabledIn((int) '#');
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn((int) (short) 0);
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
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        boolean boolean5 = feature0.enabledIn((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        boolean boolean14 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn(56320);
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) '#');
        boolean boolean15 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) '#');
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledIn(0);
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        boolean boolean7 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) 'a');
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) 'a');
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        int int17 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((-1));
        boolean boolean8 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 1, 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        boolean boolean23 = feature0.enabledByDefault();
        boolean boolean24 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn(56320);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(10);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(57343);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
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
        boolean boolean19 = feature0.enabledIn(100);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((-1));
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        boolean boolean19 = feature0.enabledIn((-1));
        boolean boolean20 = feature0.enabledByDefault();
        boolean boolean21 = feature0.enabledByDefault();
        boolean boolean23 = feature0.enabledIn((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 55296, (int) (short) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        boolean boolean15 = feature0.enabledIn(100);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 10, (int) ' ', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        boolean boolean16 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn((int) (short) 1);
        boolean boolean15 = feature0.enabledIn(2);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        int int19 = feature0.getMask();
        boolean boolean20 = feature0.enabledByDefault();
        boolean boolean22 = feature0.enabledIn(0);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) '4');
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 2, (int) (byte) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        boolean boolean17 = feature0.enabledByDefault();
        boolean boolean18 = feature0.enabledByDefault();
        boolean boolean19 = feature0.enabledByDefault();
        int int20 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean4 = feature0.enabledIn(56320);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        boolean boolean10 = feature0.enabledIn(10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(2);
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledIn((int) '4');
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        boolean boolean14 = feature0.enabledIn((int) (short) 100);
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
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(1);
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        boolean boolean11 = feature0.enabledIn(55296);
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(57343);
        boolean boolean7 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(10);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        boolean boolean18 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass19 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) 100);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (short) 1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (short) 0);
        boolean boolean11 = feature0.enabledIn((int) (byte) 100);
        boolean boolean13 = feature0.enabledIn((int) (byte) 10);
        boolean boolean15 = feature0.enabledIn(56319);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        boolean boolean14 = feature0.enabledIn(57343);
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
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) 'a');
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean10 = feature0.enabledIn((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        boolean boolean8 = feature0.enabledIn((int) 'a');
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        boolean boolean11 = feature0.enabledIn(56319);
        boolean boolean13 = feature0.enabledIn((int) '4');
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        boolean boolean10 = feature0.enabledIn((-1));
        boolean boolean12 = feature0.enabledIn((int) (byte) -1);
        int int13 = feature0.getMask();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(55296);
        boolean boolean6 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn((int) (short) 0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        int int16 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
        boolean boolean14 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) '#', (int) (byte) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        boolean boolean17 = feature0.enabledIn((int) (byte) -1);
        int int18 = feature0.getMask();
        int int19 = feature0.getMask();
        boolean boolean21 = feature0.enabledIn(2);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        boolean boolean13 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        boolean boolean15 = feature0.enabledIn((int) (byte) 1);
        int int16 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        boolean boolean17 = feature0.enabledByDefault();
        boolean boolean18 = feature0.enabledByDefault();
        boolean boolean19 = feature0.enabledByDefault();
        boolean boolean21 = feature0.enabledIn(10);
        int int22 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        boolean boolean13 = feature0.enabledIn((int) (byte) 100);
        boolean boolean14 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        int int12 = feature0.getMask();
        int int13 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        boolean boolean9 = feature0.enabledIn(100);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(10);
        int int13 = feature0.getMask();
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(56319);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
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
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        boolean boolean16 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        boolean boolean20 = feature0.enabledIn((int) (byte) 10);
        boolean boolean22 = feature0.enabledIn((int) (short) 1);
        boolean boolean23 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        int int22 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        boolean boolean21 = feature0.enabledIn(56319);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        boolean boolean17 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass18 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn(56320);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) (short) 1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        boolean boolean5 = feature0.enabledIn(57343);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) '4');
        boolean boolean14 = feature0.enabledIn((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(100);
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        boolean boolean19 = feature0.enabledIn(0);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56319);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(0);
        boolean boolean15 = feature0.enabledIn((int) (short) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (byte) 100);
        boolean boolean7 = feature0.enabledIn((int) (short) -1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(56319);
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) ' ');
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean4 = feature0.enabledIn(100);
        boolean boolean6 = feature0.enabledIn(10);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        int int14 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 0);
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(2);
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        boolean boolean11 = feature0.enabledIn((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn((int) (short) 1);
        boolean boolean15 = feature0.enabledIn(55296);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        boolean boolean14 = feature0.enabledIn(56319);
        boolean boolean15 = feature0.enabledByDefault();
        int int16 = feature0.getMask();
        boolean boolean18 = feature0.enabledIn(55296);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        boolean boolean18 = feature0.enabledIn(0);
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
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) '#');
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) -1);
        boolean boolean8 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        boolean boolean19 = feature0.enabledIn(1);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        boolean boolean19 = feature0.enabledIn((int) '4');
        boolean boolean21 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass22 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        boolean boolean9 = feature0.enabledIn(100);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) (byte) 10);
        boolean boolean13 = feature0.enabledByDefault();
        int int14 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(10);
        boolean boolean12 = feature0.enabledIn((int) (byte) -1);
        int int13 = feature0.getMask();
        boolean boolean15 = feature0.enabledIn((int) 'a');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) 1, 56320, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        boolean boolean17 = feature0.enabledIn(0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(55296);
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn((int) (byte) 10);
        int int16 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) (byte) 1);
        int int5 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledIn((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        boolean boolean14 = feature0.enabledIn((int) (short) 0);
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(2);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) 100);
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
        boolean boolean17 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(56320);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        boolean boolean13 = feature0.enabledIn((int) (byte) 1);
        boolean boolean14 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(55296);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean12 = feature0.enabledIn((int) (short) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(2);
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        boolean boolean18 = feature0.enabledIn(55296);
        int int19 = feature0.getMask();
        int int20 = feature0.getMask();
        boolean boolean21 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) -1, 57343, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(10);
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
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn(0);
        boolean boolean11 = feature0.enabledIn(2);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', (int) '4', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean10 = feature0.enabledIn(0);
        boolean boolean12 = feature0.enabledIn((int) (byte) 100);
        boolean boolean14 = feature0.enabledIn(57343);
        boolean boolean16 = feature0.enabledIn((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) 100);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) '4');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (short) 0);
        boolean boolean9 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn((-1));
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) 'a', 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) -1, (int) '#', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) -1, (int) '4', objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        boolean boolean19 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        boolean boolean13 = feature0.enabledIn((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(0);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        boolean boolean13 = feature0.enabledIn(57343);
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(2);
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
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn((int) (byte) 10);
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        boolean boolean15 = feature0.enabledIn(2);
        boolean boolean16 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (short) 100);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(56320);
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 0);
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean9 = feature0.enabledIn((int) ' ');
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(55296);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) -1);
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean11 = feature0.enabledIn(100);
        boolean boolean13 = feature0.enabledIn((int) (short) 0);
        int int14 = feature0.getMask();
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) 1);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        boolean boolean16 = feature0.enabledIn(0);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(0);
        boolean boolean13 = feature0.enabledIn(57343);
        boolean boolean14 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean12 = feature0.enabledIn((int) ' ');
        boolean boolean14 = feature0.enabledIn((int) '#');
        boolean boolean16 = feature0.enabledIn((int) (short) 0);
        boolean boolean18 = feature0.enabledIn(10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        boolean boolean13 = feature0.enabledIn((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn(10);
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn((int) (short) 100);
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
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        boolean boolean14 = feature0.enabledIn((-1));
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 100, 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledIn((int) '#');
        boolean boolean10 = feature0.enabledIn(0);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(57343);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 56319, 56320, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn(10);
        boolean boolean7 = feature0.enabledIn((int) (short) -1);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        boolean boolean14 = feature0.enabledByDefault();
        int int15 = feature0.getMask();
        int int16 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(100);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        boolean boolean14 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        boolean boolean12 = feature0.enabledIn((int) (short) 1);
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledIn((int) (short) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(0);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (short) 100);
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        int int17 = feature0.getMask();
        boolean boolean18 = feature0.enabledByDefault();
        int int19 = feature0.getMask();
        java.lang.Class<?> wildcardClass20 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 100, (int) (short) 1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        boolean boolean10 = feature0.enabledIn(56320);
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn((int) (byte) 100);
        boolean boolean16 = feature0.enabledIn((int) '#');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        int int15 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        boolean boolean16 = feature0.enabledIn((int) '#');
        int int17 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        boolean boolean23 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        boolean boolean19 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        int int11 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(2);
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn(56319);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        boolean boolean11 = feature0.enabledIn((-1));
        boolean boolean13 = feature0.enabledIn((int) '4');
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn(2);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(56319);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 0);
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(2);
        boolean boolean16 = feature0.enabledIn((-1));
        int int17 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        boolean boolean15 = feature0.enabledIn((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(0);
        boolean boolean12 = feature0.enabledIn(2);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((-1));
        boolean boolean8 = feature0.enabledIn(56320);
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledIn(56320);
        boolean boolean16 = feature0.enabledIn(56320);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        boolean boolean14 = feature0.enabledIn((int) (short) 0);
        boolean boolean16 = feature0.enabledIn(56319);
        boolean boolean17 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        boolean boolean13 = feature0.enabledIn((int) (byte) 1);
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        boolean boolean16 = feature0.enabledIn((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        boolean boolean19 = feature0.enabledIn((int) (short) 100);
        int int20 = feature0.getMask();
        boolean boolean22 = feature0.enabledIn((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        int int16 = feature0.getMask();
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn(0);
        boolean boolean11 = feature0.enabledIn((int) (byte) 10);
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        boolean boolean12 = feature0.enabledIn((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) -1, (int) (byte) -1, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(100);
        boolean boolean13 = feature0.enabledIn((int) ' ');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 1);
        boolean boolean9 = feature0.enabledIn((int) (byte) 1);
        boolean boolean11 = feature0.enabledIn(100);
        boolean boolean13 = feature0.enabledIn((int) (short) 0);
        int int14 = feature0.getMask();
        boolean boolean16 = feature0.enabledIn(57343);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        boolean boolean16 = feature0.enabledIn((int) '4');
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
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (byte) 100);
        boolean boolean5 = feature0.enabledIn((int) ' ');
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(10);
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, 10, 2, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) ' ');
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(10);
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        java.lang.Class<?> wildcardClass7 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        boolean boolean13 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
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
        boolean boolean15 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) ' ');
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (byte) -1);
        boolean boolean9 = feature0.enabledIn(56320);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
        boolean boolean15 = feature0.enabledByDefault();
        int int16 = feature0.getMask();
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) '#');
        boolean boolean11 = feature0.enabledIn((int) (short) 0);
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        boolean boolean15 = feature0.enabledIn((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) -1);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (short) 10);
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(2);
        boolean boolean13 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        boolean boolean15 = feature0.enabledIn(0);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        int int16 = feature0.getMask();
        int int17 = feature0.getMask();
        boolean boolean18 = feature0.enabledByDefault();
        boolean boolean19 = feature0.enabledByDefault();
        boolean boolean21 = feature0.enabledIn(55296);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        boolean boolean16 = feature0.enabledIn((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledIn((int) '4');
        boolean boolean5 = feature0.enabledIn((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledIn(56319);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        int int15 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn((int) 'a');
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
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) ' ', 56319, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) ' ');
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn(1);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((-1));
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean6 = feature0.enabledIn((int) (byte) -1);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (short) -1);
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        boolean boolean18 = feature0.enabledIn((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        int int12 = feature0.getMask();
        int int13 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((-1));
        boolean boolean13 = feature0.enabledIn((int) ' ');
        boolean boolean15 = feature0.enabledIn(1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(57343);
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn((int) (short) 1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((int) (short) 0);
        int int13 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 0);
        boolean boolean11 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        boolean boolean13 = feature0.enabledByDefault();
        int int14 = feature0.getMask();
        int int15 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(1);
        boolean boolean12 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        boolean boolean9 = feature0.enabledIn(100);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(10);
        int int13 = feature0.getMask();
        int int14 = feature0.getMask();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        boolean boolean13 = feature0.enabledIn((int) ' ');
        int int14 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) (short) 100);
        boolean boolean13 = feature0.enabledByDefault();
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
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        boolean boolean10 = feature0.enabledIn((int) (short) 0);
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        boolean boolean13 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        boolean boolean14 = feature0.enabledByDefault();
        int int15 = feature0.getMask();
        boolean boolean17 = feature0.enabledIn((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        int int10 = feature0.getMask();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((-1));
        boolean boolean10 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) (byte) -1);
        int int5 = feature0.getMask();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (short) 100);
        boolean boolean13 = feature0.enabledIn((int) (short) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) -1);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        boolean boolean12 = feature0.enabledIn((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(2);
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledIn(100);
        int int17 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) '4');
        boolean boolean4 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        boolean boolean15 = feature0.enabledIn(100);
        boolean boolean16 = feature0.enabledByDefault();
        boolean boolean18 = feature0.enabledIn(55296);
        boolean boolean20 = feature0.enabledIn((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        boolean boolean10 = feature0.enabledIn((-1));
        boolean boolean12 = feature0.enabledIn((-1));
        int int13 = feature0.getMask();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) '#');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (short) -1);
        boolean boolean11 = feature0.enabledIn(0);
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        boolean boolean17 = feature0.enabledByDefault();
        int int18 = feature0.getMask();
        boolean boolean20 = feature0.enabledIn(0);
        boolean boolean22 = feature0.enabledIn((int) '4');
        java.lang.Class<?> wildcardClass23 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (byte) 100);
        boolean boolean7 = feature0.enabledIn((int) (short) 10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        int int11 = feature0.getMask();
        int int12 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn(2);
        boolean boolean4 = feature0.enabledIn((int) (short) 1);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '4');
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        boolean boolean12 = feature0.enabledIn((-1));
        boolean boolean13 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean9 = feature0.enabledIn((int) '4');
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(57343);
        boolean boolean11 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        boolean boolean11 = feature0.enabledIn(57343);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
        boolean boolean16 = feature0.enabledIn((int) '4');
        boolean boolean18 = feature0.enabledIn((int) '#');
        boolean boolean20 = feature0.enabledIn((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) ' ');
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        int int12 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean10 = feature0.enabledIn((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
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
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(0);
        boolean boolean11 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledIn(10);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        boolean boolean12 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(57343);
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn(55296);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        int int12 = feature0.getMask();
        int int13 = feature0.getMask();
        int int14 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledIn(2);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (byte) 100);
        boolean boolean7 = feature0.enabledIn((int) (short) -1);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        boolean boolean12 = feature0.enabledIn((int) ' ');
        boolean boolean14 = feature0.enabledIn((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 10);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn(10);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 100);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(56320);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(2);
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(10);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean6 = feature0.enabledIn(0);
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(57343);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) ' ');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn(100);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
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
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledIn(57343);
        java.lang.Class<?> wildcardClass18 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledIn((int) (short) 10);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn((int) '4');
        boolean boolean15 = feature0.enabledIn(0);
        java.lang.Class<?> wildcardClass16 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) -1);
        boolean boolean9 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) ' ');
        boolean boolean10 = feature0.enabledIn((-1));
        boolean boolean12 = feature0.enabledIn((int) (short) 0);
        int int13 = feature0.getMask();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(10);
        int int11 = feature0.getMask();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(55296);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (short) 100);
        boolean boolean12 = feature0.enabledIn((int) (short) 1);
        boolean boolean13 = feature0.enabledByDefault();
        int int14 = feature0.getMask();
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        boolean boolean15 = feature0.enabledByDefault();
        boolean boolean16 = feature0.enabledByDefault();
        boolean boolean17 = feature0.enabledByDefault();
        boolean boolean19 = feature0.enabledIn(0);
        boolean boolean20 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn(56320);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn((int) ' ');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) 1);
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (byte) 100, 10, objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) 'a');
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(1);
        boolean boolean8 = feature0.enabledIn((int) '#');
        boolean boolean10 = feature0.enabledIn((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        boolean boolean20 = feature0.enabledIn(56320);
        java.lang.Class<?> wildcardClass21 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn(56320);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) 'a');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (byte) 100);
        boolean boolean5 = feature0.enabledIn((int) ' ');
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn((int) (short) -1);
        boolean boolean12 = feature0.enabledIn(55296);
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean15 = feature0.enabledIn((int) (short) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) -1);
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (short) 10);
        boolean boolean13 = feature0.enabledIn((int) '4');
        int int14 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) '#');
        boolean boolean5 = feature0.enabledIn((int) (byte) 10);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn(2);
        boolean boolean4 = feature0.enabledIn((int) (short) 1);
        int int5 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        int int19 = feature0.getMask();
        boolean boolean21 = feature0.enabledIn((int) (short) 10);
        boolean boolean22 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (short) 10);
        boolean boolean10 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) ' ');
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledByDefault();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) '#');
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        int int21 = feature0.getMask();
        int int22 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        boolean boolean12 = feature0.enabledIn((int) (short) 0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) (short) 100);
        int int10 = feature0.getMask();
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) '4');
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        boolean boolean14 = feature0.enabledIn(1);
        boolean boolean16 = feature0.enabledIn(57343);
        int int17 = feature0.getMask();
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
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        boolean boolean19 = feature0.enabledIn(2);
        java.lang.Class<?> wildcardClass20 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(56320);
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) '#');
        boolean boolean10 = feature0.enabledIn(55296);
        int int11 = feature0.getMask();
        boolean boolean13 = feature0.enabledIn(55296);
        boolean boolean14 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        boolean boolean9 = feature0.enabledIn(100);
        boolean boolean11 = feature0.enabledIn((int) (short) 100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(10);
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (short) -1);
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        boolean boolean7 = feature0.enabledIn((int) ' ');
        int int8 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) -1);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        boolean boolean10 = feature0.enabledIn(56320);
        int int11 = feature0.getMask();
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) ' ');
        int int7 = feature0.getMask();
        boolean boolean9 = feature0.enabledIn((int) (short) 1);
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn(0);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledIn((int) '4');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn(55296);
        boolean boolean7 = feature0.enabledByDefault();
        int int8 = feature0.getMask();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((-1));
        boolean boolean4 = feature0.enabledIn(2);
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn((int) '#');
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn(56319);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((-1));
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        java.lang.Class<?> wildcardClass24 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        boolean boolean12 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) 1);
        boolean boolean5 = feature0.enabledIn(57343);
        java.lang.Class<?> wildcardClass6 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 0);
        boolean boolean11 = feature0.enabledIn((int) (short) 1);
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        boolean boolean4 = feature0.enabledByDefault();
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) -1);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        int int11 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        boolean boolean16 = feature0.enabledByDefault();
        boolean boolean18 = feature0.enabledIn((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        int int17 = feature0.getMask();
        boolean boolean18 = feature0.enabledByDefault();
        int int19 = feature0.getMask();
        boolean boolean21 = feature0.enabledIn((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledIn((int) (short) 1);
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        boolean boolean12 = feature0.enabledIn((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean6 = feature0.enabledIn(100);
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass9 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean5 = feature0.enabledIn(57343);
        boolean boolean7 = feature0.enabledIn((int) '4');
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (byte) 1);
        int int12 = feature0.getMask();
        boolean boolean14 = feature0.enabledIn((int) '#');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn((int) (byte) 100);
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) '4');
        boolean boolean12 = feature0.enabledByDefault();
        boolean boolean14 = feature0.enabledIn((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        int int3 = feature0.getMask();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((int) (short) 0);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledIn((int) 'a');
        boolean boolean11 = feature0.enabledIn((int) (short) 10);
        boolean boolean13 = feature0.enabledIn(100);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        boolean boolean13 = feature0.enabledByDefault();
        int int14 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((-1));
        boolean boolean7 = feature0.enabledIn(100);
        boolean boolean9 = feature0.enabledIn((int) (short) 0);
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean13 = feature0.enabledIn(100);
        boolean boolean15 = feature0.enabledIn((int) '#');
        boolean boolean16 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass17 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
        boolean boolean14 = feature0.enabledIn((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
        java.lang.Class<?> wildcardClass14 = feature0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) (byte) 0);
        boolean boolean4 = feature0.enabledIn((int) ' ');
        boolean boolean6 = feature0.enabledIn(100);
        boolean boolean7 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass8 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        boolean boolean2 = feature0.enabledIn((int) ' ');
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean6 = feature0.enabledByDefault();
        int int7 = feature0.getMask();
        int int8 = feature0.getMask();
        boolean boolean9 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledIn((int) (short) -1);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn(56319);
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(1);
        int int8 = feature0.getMask();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean5 = feature0.enabledByDefault();
        boolean boolean7 = feature0.enabledIn(55296);
        boolean boolean8 = feature0.enabledByDefault();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(0);
        boolean boolean9 = feature0.enabledByDefault();
        int int10 = feature0.getMask();
        java.lang.Class<?> wildcardClass11 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(10);
        boolean boolean6 = feature0.enabledIn(2);
        boolean boolean8 = feature0.enabledIn((int) 'a');
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        boolean boolean5 = feature0.enabledIn((int) (short) 1);
        int int6 = feature0.getMask();
        int int7 = feature0.getMask();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean10 = feature0.enabledIn((int) (byte) 10);
        boolean boolean12 = feature0.enabledIn((int) (byte) 0);
        int int13 = feature0.getMask();
        boolean boolean14 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass15 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1 + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_1_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn(10);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(56320);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        boolean boolean2 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledIn((int) (short) -1);
        int int5 = feature0.getMask();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn(0);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledIn(0);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        int int5 = feature0.getMask();
        boolean boolean7 = feature0.enabledIn(0);
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        boolean boolean11 = feature0.enabledIn((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean2 = feature0.enabledIn((int) (byte) -1);
        boolean boolean4 = feature0.enabledIn(56320);
        boolean boolean5 = feature0.enabledByDefault();
        int int6 = feature0.getMask();
        boolean boolean8 = feature0.enabledIn((int) (short) 0);
        int int9 = feature0.getMask();
        boolean boolean10 = feature0.enabledByDefault();
        boolean boolean11 = feature0.enabledByDefault();
        boolean boolean12 = feature0.enabledByDefault();
        int int13 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean3 = feature0.enabledIn((int) (short) -1);
        boolean boolean5 = feature0.enabledIn((int) (short) -1);
        int int6 = feature0.getMask();
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        int int9 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        boolean boolean18 = feature0.enabledByDefault();
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
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        int int1 = feature0.getMask();
        boolean boolean2 = feature0.enabledByDefault();
        int int3 = feature0.getMask();
        int int4 = feature0.getMask();
        boolean boolean6 = feature0.enabledIn(56320);
        boolean boolean7 = feature0.enabledByDefault();
        boolean boolean8 = feature0.enabledByDefault();
        boolean boolean9 = feature0.enabledByDefault();
        java.lang.Class<?> wildcardClass10 = feature0.getClass();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamWriter xMLStreamWriter4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator toXmlGenerator5 = new com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator(iOContext0, (int) (short) -1, (-1), objectCodec3, xMLStreamWriter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature feature0 = com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION;
        boolean boolean1 = feature0.enabledByDefault();
        int int2 = feature0.getMask();
        boolean boolean3 = feature0.enabledByDefault();
        boolean boolean4 = feature0.enabledByDefault();
        boolean boolean6 = feature0.enabledIn((-1));
        boolean boolean8 = feature0.enabledIn(56320);
        boolean boolean10 = feature0.enabledIn((int) (byte) 0);
        boolean boolean12 = feature0.enabledIn(0);
        boolean boolean14 = feature0.enabledIn(56320);
        int int15 = feature0.getMask();
        org.junit.Assert.assertTrue("'" + feature0 + "' != '" + com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION + "'", feature0.equals(com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator.Feature.WRITE_XML_DECLARATION));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        boolean boolean20 = feature0.enabledIn(56320);
        int int21 = feature0.getMask();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }
}

