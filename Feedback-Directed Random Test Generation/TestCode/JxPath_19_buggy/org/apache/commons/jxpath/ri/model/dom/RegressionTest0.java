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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest2 = null;
        boolean boolean3 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(nodePointer0, (java.lang.Object) "hi!", nodeTest2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.XML_NAMESPACE_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/XML/1998/namespace" + "'", str0, "http://www.w3.org/XML/1998/namespace");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dOMNodePointer2.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        boolean boolean2 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(node0, nodeTest1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer2.namespacePointer("");
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        org.apache.commons.jxpath.ri.QName qName9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = jDOMNodePointer2.createChild(jXPathContext8, qName9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer7);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer2.namespacePointer("");
        jDOMNodePointer2.printPointerChain();
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dOMNodePointer2.asPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer2.namespacePointer("");
        nodePointer7.printPointerChain();
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer7);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str1 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) 'a');
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer2.namespacePointer("");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer2.getValuePointer();
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer2.namespacePointer("");
        java.lang.Object obj8 = jDOMNodePointer2.getBaseValue();
        boolean boolean9 = jDOMNodePointer2.isAttribute();
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.XMLNS_NAMESPACE_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/xmlns/" + "'", str0, "http://www.w3.org/2000/xmlns/");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dOMNodePointer2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        java.lang.String str3 = jDOMNodePointer2.toString();
        java.util.Locale locale4 = jDOMNodePointer2.getLocale();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer2.namespacePointer("");
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        org.apache.commons.jxpath.ri.QName qName9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = jDOMNodePointer2.createChild(jXPathContext8, qName9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        org.apache.commons.jxpath.JXPathContext jXPathContext3 = null;
        org.apache.commons.jxpath.ri.QName qName4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = dOMNodePointer2.createAttribute(jXPathContext3, qName4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale4);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer5, qName6, (java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer2.setValue((java.lang.Object) jDOMNodePointer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = jDOMNodePointer2.getParent();
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        org.apache.commons.jxpath.ri.QName qName5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer2.createAttribute(jXPathContext4, qName5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path /@null, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.String str1 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) 10);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = dOMNodePointer2.attributeIterator(qName3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        boolean boolean3 = jDOMNodePointer2.isNode();
        jDOMNodePointer2.setIndex(10);
        java.lang.String str6 = jDOMNodePointer2.asPath();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        java.lang.String str7 = jDOMNodePointer2.getNamespaceURI("");
        java.lang.Object obj8 = jDOMNodePointer2.getNodeValue();
        boolean boolean9 = jDOMNodePointer2.isAttribute();
        org.w3c.dom.Node node10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dOMNodePointer11.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        java.lang.String str7 = jDOMNodePointer2.getNamespaceURI("");
        java.lang.Object obj8 = jDOMNodePointer2.getNodeValue();
        boolean boolean9 = jDOMNodePointer2.isAttribute();
        org.w3c.dom.Node node10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = dOMNodePointer11.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        boolean boolean3 = jDOMNodePointer2.isNode();
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = jDOMNodePointer2.attributeIterator(qName4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(nodeIterator5);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        java.lang.String str7 = jDOMNodePointer2.getNamespaceURI("");
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale8, "http://www.w3.org/XML/1998/namespace");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Object obj0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(obj0, locale1, "hi!");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = jDOMNodePointer3.getNodeSetByKey(jXPathContext4, "hi!", (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        java.lang.String str7 = jDOMNodePointer2.getNamespaceURI("");
        java.lang.Object obj8 = jDOMNodePointer2.getNodeValue();
        boolean boolean9 = jDOMNodePointer2.isAttribute();
        org.w3c.dom.Node node10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node10);
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = null;
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = dOMNodePointer11.createChild(jXPathContext12, qName13, (int) ' ', obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        java.lang.String str3 = jDOMNodePointer2.toString();
        jDOMNodePointer2.setAttribute(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer2.namespacePointer("");
        boolean boolean8 = nodePointer7.isRoot();
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        java.lang.String str7 = jDOMNodePointer2.getNamespaceURI("");
        java.lang.Object obj8 = jDOMNodePointer2.getNodeValue();
        boolean boolean9 = jDOMNodePointer2.isAttribute();
        org.w3c.dom.Node node10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node10);
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = null;
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale16);
        org.apache.commons.jxpath.ri.QName qName18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17, qName18, (java.lang.Object) (-1.0d));
        java.lang.String str22 = jDOMNodePointer17.getNamespaceURI("");
        java.lang.Object obj23 = jDOMNodePointer17.getNodeValue();
        boolean boolean24 = jDOMNodePointer17.isAttribute();
        org.w3c.dom.Node node25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17, node25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = dOMNodePointer11.createChild(jXPathContext12, qName13, 0, (java.lang.Object) jDOMNodePointer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (byte) -1 + "'", obj23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.QName qName3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, qName3, (java.lang.Object) (-1.0d));
        java.lang.String str7 = jDOMNodePointer2.getNamespaceURI("");
        java.lang.Object obj8 = jDOMNodePointer2.getNodeValue();
        boolean boolean9 = jDOMNodePointer2.isAttribute();
        org.w3c.dom.Node node10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dOMNodePointer11.asPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}

