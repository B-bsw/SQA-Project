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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int0 = com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.XML_ATTRIBUTE_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.XML_END;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.XML_START_ELEMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.XML_TEXT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int0 = com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.XML_END_ELEMENT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.XML_ATTRIBUTE_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream3 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream3 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        javax.xml.stream.XMLStreamReader xMLStreamReader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream xmlTokenStream2 = new com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream(xMLStreamReader0, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

