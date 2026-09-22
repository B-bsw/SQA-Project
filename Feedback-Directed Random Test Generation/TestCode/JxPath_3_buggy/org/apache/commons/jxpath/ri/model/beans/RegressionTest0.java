package org.apache.commons.jxpath.ri.model.beans;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = org.apache.commons.jxpath.ri.model.NodePointer.WHOLE_COLLECTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.NodePointer.UNKNOWN_NAMESPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<<unknown namespace>>" + "'", str0, "<<unknown namespace>>");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = org.apache.commons.jxpath.ri.model.beans.PropertyPointer.UNSPECIFIED_PROPERTY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer1 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = nullPropertyPointer1.attributeIterator(qName2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer1 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer0);
        org.apache.commons.jxpath.JXPathContext jXPathContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer4 = nullPropertyPointer1.getPointerByID(jXPathContext2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer1 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = nullPropertyPointer1.getBean();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer1 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer0);
        org.apache.commons.jxpath.JXPathContext jXPathContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer4 = nullPropertyPointer1.getPointerByID(jXPathContext2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = nodePointer3.attributeIterator(qName4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nodePointer3.getParent();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.QName qName6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer4.createAttribute(jXPathContext5, qName6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer4);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nodePointer3.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.namespacePointer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nodePointer3.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale5 = nodePointer4.getLocale();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer1 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer0);
        org.apache.commons.jxpath.JXPathContext jXPathContext2 = null;
        org.apache.commons.jxpath.ri.QName qName3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nullPropertyPointer1.createChild(jXPathContext2, qName3, (int) (byte) 0, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nodePointer3.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = nodePointer4.isNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = nodePointer3.compareTo((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.apache.commons.jxpath.ri.model.NodePointer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer1 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer0);
        org.apache.commons.jxpath.JXPathContext jXPathContext2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = nullPropertyPointer1.createPath(jXPathContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nodePointer3.getParent();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10, locale8);
        nodePointer9.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer4, qName5, (java.lang.Object) true);
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer16 = nodePointer12.getPointerByKey(jXPathContext13, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nodePointer3.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = nodePointer4.isAttribute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer1 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer0);
        org.apache.commons.jxpath.JXPathContext jXPathContext2 = null;
        org.apache.commons.jxpath.ri.QName qName3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nullPropertyPointer1.createChild(jXPathContext2, qName3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        nodePointer3.setAttribute(true);
        java.lang.Object obj6 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = nodePointer3.getPointerByKey(jXPathContext7, "", "<<unknown namespace>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10 + "'", obj6, 10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nodePointer3.getParent();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = nodePointer3.getPointerByID(jXPathContext5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer1 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName2, (java.lang.Object) 10, locale4);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = nodePointer5.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer8 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = nullPropertyPointer1.compareChildNodePointers(nodePointer5, nodePointer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNull(namespaceResolver6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer1 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer0);
        org.apache.commons.jxpath.JXPathContext jXPathContext2 = null;
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName5, (java.lang.Object) 10, locale7);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver9 = nodePointer8.getNamespaceResolver();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nullPropertyPointer1.createChild(jXPathContext2, qName3, (int) (byte) 10, (java.lang.Object) namespaceResolver9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNull(namespaceResolver9);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer1 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer0);
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName2, (java.lang.Object) 10, locale4);
        nodePointer5.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = null;
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer9 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = nullPropertyPointer1.compareChildNodePointers(nodePointer5, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        nodePointer3.setAttribute(true);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = nodePointer3.attributeIterator(qName7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nodePointer3.getParent();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10, locale8);
        nodePointer9.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer4, qName5, (java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = nodePointer4.compareTo((java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nodePointer3.getParent();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10, locale8);
        nodePointer9.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer4, qName5, (java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = nodePointer4.isRoot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        nodePointer3.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        boolean boolean7 = nodePointer3.testNode(nodeTest6);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        nodePointer3.setAttribute(true);
        java.lang.Object obj6 = nodePointer3.getNodeValue();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10 + "'", obj6, 10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        nodePointer3.setAttribute(true);
        boolean boolean6 = nodePointer3.isRoot();
        boolean boolean7 = nodePointer3.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer3.getImmediateParentPointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        nodePointer3.setAttribute(true);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver8 = null;
        // The following exception was thrown during execution in test generation
        try {
            nodePointer7.setNamespaceResolver(namespaceResolver8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer7);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer5 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nullPropertyPointer5.createChild(jXPathContext6, qName7, (int) (short) 100, (java.lang.Object) "<<unknown namespace>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer5 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        java.lang.String[] strArray6 = nullPropertyPointer5.getPropertyNames();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer5 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nullPropertyPointer5.getValuePointer();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            nullPropertyPointer5.setValue(obj7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidAccessException; message: Cannot set property 10/*, path does not match a changeable location");
        } catch (org.apache.commons.jxpath.JXPathInvalidAccessException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) true, locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = nodePointer3.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = nodePointer4.getNamespaceResolver();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer4);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = nodePointer3.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = nodePointer3.attributeIterator(qName6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNull(nodeIterator5);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer5 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10, locale8);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = nodePointer9.getNamespaceResolver();
        java.lang.String str11 = nodePointer9.getNamespaceURI();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 10, locale15);
        nodePointer16.setAttribute(true);
        java.lang.Object obj19 = nodePointer16.getRootNode();
        nodePointer16.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName12, (java.lang.Object) nodePointer16);
        // The following exception was thrown during execution in test generation
        try {
            nullPropertyPointer5.setValue((java.lang.Object) nodePointer16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidAccessException; message: Cannot set property 10/*, path does not match a changeable location");
        } catch (org.apache.commons.jxpath.JXPathInvalidAccessException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNull(namespaceResolver10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10 + "'", obj19, 10);
        org.junit.Assert.assertNotNull(nodePointer22);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer5 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nullPropertyPointer5.getValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver7 = null;
        nullPropertyPointer5.setNamespaceResolver(namespaceResolver7);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        java.lang.String str5 = nodePointer3.getNamespaceURI();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 10, locale9);
        nodePointer10.setAttribute(true);
        java.lang.Object obj13 = nodePointer10.getRootNode();
        nodePointer10.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName6, (java.lang.Object) nodePointer10);
        // The following exception was thrown during execution in test generation
        try {
            nodePointer10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot remove an object that is not some other object's property or a collection element");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10 + "'", obj13, 10);
        org.junit.Assert.assertNotNull(nodePointer16);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        nodePointer3.setAttribute(true);
        java.lang.Object obj6 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer3.namespacePointer("hi!");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10 + "'", obj6, 10);
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer5 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nullPropertyPointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nullPropertyPointer5.getParent();
        java.lang.String str8 = nullPropertyPointer5.getNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNull(str8);
    }
}

