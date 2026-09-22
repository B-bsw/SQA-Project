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
        org.w3c.dom.Node node0 = null;
        java.lang.String str2 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute(node0, "hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer3.setValue((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = dOMNodePointer3.createPath(jXPathContext4, obj5);
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
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = dOMNodePointer3.getPointerByKey(jXPathContext4, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        org.apache.commons.jxpath.ri.QName qName5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = dOMNodePointer3.createAttribute(jXPathContext4, qName5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path id('')/@null, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer3.setValue((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.NodePointer.UNKNOWN_NAMESPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<<unknown namespace>>" + "'", str0, "<<unknown namespace>>");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = dOMNodePointer3.getNodeSetByKey(jXPathContext4, "hi!", obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int0 = org.apache.commons.jxpath.ri.model.NodePointer.WHOLE_COLLECTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = dOMNodePointer3.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = dOMNodePointer3.getNodeSetByKey(jXPathContext4, "hi!", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        boolean boolean2 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(node0, nodeTest1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer3.setValue((java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.XML_NAMESPACE_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/XML/1998/namespace" + "'", str0, "http://www.w3.org/XML/1998/namespace");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.XMLNS_NAMESPACE_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/xmlns/" + "'", str0, "http://www.w3.org/2000/xmlns/");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        org.apache.commons.jxpath.ri.QName qName4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = dOMNodePointer3.attributeIterator(qName4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dOMNodePointer3.getNamespaceURI();
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
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName4 = dOMNodePointer3.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.w3c.dom.Node node0 = null;
        java.lang.String str2 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute(node0, "http://www.w3.org/2000/xmlns/");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = dOMNodePointer3.namespaceIterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = dOMNodePointer3.getNodeSetByKey(jXPathContext4, "http://www.w3.org/XML/1998/namespace", (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dOMNodePointer3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = dOMNodePointer3.getPointerByKey(jXPathContext4, "", "http://www.w3.org/2000/xmlns/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        org.w3c.dom.Node node4 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node4, locale5, "hi!");
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100L, locale10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dOMNodePointer3.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer7, nodePointer11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.w3c.dom.Node");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer11);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = dOMNodePointer3.getNodeSetByKey(jXPathContext4, "", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer6 = dOMNodePointer3.getPointerByID(jXPathContext4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "<<unknown namespace>>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dOMNodePointer3.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = dOMNodePointer3.getNodeSetByKey(jXPathContext4, "http://www.w3.org/2000/xmlns/", (java.lang.Object) "<<unknown namespace>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dOMNodePointer3.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer6 = dOMNodePointer3.getPointerByID(jXPathContext4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100L, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet8 = nodePointer3.getNodeSetByKey(jXPathContext5, "", (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = dOMNodePointer2.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "<<unknown namespace>>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dOMNodePointer3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "<<unknown namespace>>");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer6 = dOMNodePointer3.getPointerByID(jXPathContext4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dOMNodePointer2.asPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100L, locale2);
        java.lang.Object obj4 = nodePointer3.getNode();
        java.lang.Object obj5 = nodePointer3.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100L + "'", obj4, 100L);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100L + "'", obj5, 100L);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100L, locale2);
        java.lang.Object obj4 = nodePointer3.getNode();
        boolean boolean5 = nodePointer3.isNode();
        nodePointer3.setIndex((int) (byte) -1);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100L + "'", obj4, 100L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1);
        org.apache.commons.jxpath.JXPathContext jXPathContext3 = null;
        org.apache.commons.jxpath.ri.QName qName4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = dOMNodePointer2.createChild(jXPathContext3, qName4, (int) (short) -1, (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

