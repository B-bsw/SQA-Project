package com.fasterxml.jackson.dataformat.xml.deser;

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
        int int0 = com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature.collectDefaults();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.DEFAULT_UNNAMED_TEXT_PROPERTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) (byte) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 1, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 0, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) 'a', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 0, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) (byte) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 1, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 100, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) (byte) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) -1, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 1, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 10, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) ' ', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 100, (int) (short) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '4', (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) ' ', (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) '#', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) (short) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) (short) 0, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) 'a', (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) -1, (int) (byte) 100, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) '#', (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (int) (short) 1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, 10, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (-1), (int) '4', objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 100, (int) (byte) -1, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (byte) 10, (-1), objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.fasterxml.jackson.core.io.IOContext iOContext0 = null;
        com.fasterxml.jackson.core.ObjectCodec objectCodec3 = null;
        javax.xml.stream.XMLStreamReader xMLStreamReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser fromXmlParser5 = new com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser(iOContext0, (int) (short) 0, (int) (short) 10, objectCodec3, xMLStreamReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

