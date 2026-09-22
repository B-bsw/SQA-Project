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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.XML_NAMESPACE_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/XML/1998/namespace" + "'", str0, "http://www.w3.org/XML/1998/namespace");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.lang.Object obj5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName4, obj5);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getLocalName(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer6, qName7, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = jDOMNodePointer10.getBaseValue();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer6, qName7, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = jDOMNodePointer3.createChild(jXPathContext11, qName12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getPrefix(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        int int5 = jDOMNodePointer3.getIndex();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2147483648) + "'", int5 == (-2147483648));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        boolean boolean2 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(node0, nodeTest1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = jDOMNodePointer3.compareTo((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to org.apache.commons.jxpath.ri.model.NodePointer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isActual();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = jDOMNodePointer3.isLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str1 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) 0L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.w3c.dom.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.getNamespaceURI(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer3.namespacePointer("");
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale9, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj12 = jDOMNodePointer11.getBaseValue();
        boolean boolean13 = jDOMNodePointer11.isLeaf();
        java.lang.String str15 = jDOMNodePointer11.getNamespaceURI("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer6.createPath(jXPathContext7, (java.lang.Object) jDOMNodePointer11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot modify a namespace");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        java.lang.String str7 = jDOMNodePointer3.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer3.getImmediateParentPointer();
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer3.setValue((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.jdom.Element");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean4 = jDOMNodePointer3.isRoot();
        java.util.Locale locale5 = jDOMNodePointer3.getLocale();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean4 = jDOMNodePointer3.isRoot();
        java.lang.Class<?> wildcardClass5 = jDOMNodePointer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer6, qName7, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) 100.0d);
        boolean boolean11 = jDOMNodePointer10.isNode();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer3.namespacePointer("");
        java.util.Locale locale7 = jDOMNodePointer3.getLocale();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer3.namespacePointer("");
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale7);
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale10, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj13 = jDOMNodePointer12.getBaseValue();
        boolean boolean14 = jDOMNodePointer12.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = null;
        org.apache.commons.jxpath.ri.QName qName16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer15, qName16, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = null;
        org.apache.commons.jxpath.ri.QName qName21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer20, qName21, (java.lang.Object) 100.0d);
        java.lang.Object obj24 = nodePointer23.getNodeValue();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12, nodePointer23);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: JXPath internal error: compareChildNodes called for ");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0f + "'", obj13, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer6, qName7, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer13 = jDOMNodePointer10.getPointerByID(jXPathContext11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean4 = jDOMNodePointer3.isRoot();
        boolean boolean5 = jDOMNodePointer3.isRoot();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer6, qName7, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) 100.0d);
        java.lang.String str11 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer3);
        boolean boolean12 = jDOMNodePointer3.isContainer();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 100.0d);
        java.lang.Object obj4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer0, obj4);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer5, (java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer7.setValue((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.jdom.Element");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 0.0d, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getBaseValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 0.0d + "'", obj3, 0.0d);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        java.lang.String str7 = jDOMNodePointer3.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer3.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.QName qName9 = jDOMNodePointer3.getName();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNotNull(qName9);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100L, locale2);
        java.lang.Object obj4 = nodePointer3.getNode();
        java.lang.Object obj5 = nodePointer3.clone();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100L + "'", obj4, 100L);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean4 = jDOMNodePointer3.isRoot();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale7, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj10 = jDOMNodePointer9.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName11 = jDOMNodePointer9.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = jDOMNodePointer3.createChild(jXPathContext5, qName11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0f + "'", obj10, 1.0f);
        org.junit.Assert.assertNotNull(qName11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer6, qName7, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = jDOMNodePointer3.getNode();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer3.namespacePointer("");
        nodePointer6.printPointerChain();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        java.lang.String str7 = jDOMNodePointer3.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer3.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = jDOMNodePointer3.namespaceIterator();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodeIterator9);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer6, qName7, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer11, qName12, (java.lang.Object) 100.0d);
        java.lang.Object obj15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer11, obj15);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16, (java.lang.Object) (short) 10);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 100L, locale21);
        java.lang.Object obj23 = nodePointer22.getNode();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = jDOMNodePointer3.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16, nodePointer22);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: JXPath internal error: compareChildNodes called for 1.0");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100L + "'", obj23, 100L);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.XMLNS_NAMESPACE_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/xmlns/" + "'", str0, "http://www.w3.org/2000/xmlns/");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        java.lang.String str7 = jDOMNodePointer3.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer3.getImmediateParentPointer();
        boolean boolean9 = jDOMNodePointer3.isCollection();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer3.namespacePointer("");
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMNodePointer8.getParent();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 0.0d, locale1);
        boolean boolean3 = jDOMNodePointer2.isLeaf();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer6, qName7, (java.lang.Object) 100.0d);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) 100.0d);
        boolean boolean11 = jDOMNodePointer3.isCollection();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.XML_NAMESPACE_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/XML/1998/namespace" + "'", str0, "http://www.w3.org/XML/1998/namespace");
    }
}

