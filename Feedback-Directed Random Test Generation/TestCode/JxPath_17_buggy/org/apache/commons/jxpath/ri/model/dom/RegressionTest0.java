package org.apache.commons.jxpath.ri.model.dom;

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator jDOMAttributeIterator2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator(nodePointer0, qName1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator dOMAttributeIterator2 = new org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator(nodePointer0, qName1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

