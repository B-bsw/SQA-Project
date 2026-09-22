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
        boolean boolean3 = dOMNodePointer2.isCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dOMNodePointer2.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        org.apache.commons.jxpath.JXPathContext jXPathContext3 = null;
        org.apache.commons.jxpath.ri.QName qName4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer2.createChild(jXPathContext3, qName4, (int) (short) 1);
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isActual();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer2.printPointerChain();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isActual();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dOMNodePointer2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.XMLNS_NAMESPACE_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/xmlns/" + "'", str0, "http://www.w3.org/2000/xmlns/");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isActual();
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer6 = dOMNodePointer2.getPointerByID(jXPathContext4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isCollection();
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer2, qName4, (java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = nodePointer6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        java.lang.String str3 = dOMNodePointer2.getDefaultNamespaceURI();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dOMNodePointer2.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isActual();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = dOMNodePointer2.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isActual();
        java.lang.String str4 = dOMNodePointer2.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        java.lang.String str3 = dOMNodePointer2.getDefaultNamespaceURI();
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        org.apache.commons.jxpath.ri.QName qName5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = dOMNodePointer2.createAttribute(jXPathContext4, qName5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isCollection();
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer2, qName4, (java.lang.Object) 1);
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = nodePointer6.getPointerByKey(jXPathContext7, "", "http://www.w3.org/2000/xmlns/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        java.lang.String str3 = dOMNodePointer2.getDefaultNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = dOMNodePointer2.namespacePointer("http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer8 = dOMNodePointer2.getPointerByID(jXPathContext6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(nodePointer5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isActual();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer2, (java.lang.Object) (byte) 100);
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = dOMNodePointer2.createAttribute(jXPathContext6, qName7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isCollection();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer2.setValue((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("");
        jDOMNodePointer2.printPointerChain();
        jDOMNodePointer2.setIndex(10);
        java.lang.Object obj8 = jDOMNodePointer2.getBaseValue();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (byte) -1 + "'", obj8, (byte) -1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isActual();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer2, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = jDOMNodePointer5.getBaseValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 100 + "'", obj6, (byte) 100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isActual();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer2, (java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass6 = dOMNodePointer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("");
        jDOMNodePointer2.printPointerChain();
        java.lang.String str6 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer2);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Object obj0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(obj0, locale1, "hi!");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isActual();
        org.w3c.dom.Node node4 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer2, node4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isActual();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer2, (java.lang.Object) (byte) 100);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = dOMNodePointer2.attributeIterator(qName6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) -1, locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("");
        jDOMNodePointer2.printPointerChain();
        java.lang.String str6 = jDOMNodePointer2.asPath();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isCollection();
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer2, qName4, (java.lang.Object) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dOMNodePointer2.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isCollection();
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer2, qName4, (java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = dOMNodePointer2.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isActual();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer2, (java.lang.Object) (byte) 100);
        boolean boolean6 = jDOMNodePointer5.isLeaf();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer5.attributeIterator(qName7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodeIterator8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isCollection();
        org.apache.commons.jxpath.ri.QName qName4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer2, qName4, (java.lang.Object) 1);
        boolean boolean7 = dOMNodePointer2.isActual();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }
}

