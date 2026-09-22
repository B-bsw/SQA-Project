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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = dOMNodePointer2.getImmediateValuePointer();
        java.lang.Object obj4 = dOMNodePointer2.getBaseValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dOMNodePointer2.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = org.apache.commons.jxpath.ri.model.NodePointer.WHOLE_COLLECTION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = dOMNodePointer2.getImmediateValuePointer();
        java.lang.Object obj4 = dOMNodePointer2.getBaseValue();
        boolean boolean5 = dOMNodePointer2.isCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = dOMNodePointer2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isAttribute();
        boolean boolean4 = dOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node8);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = dOMNodePointer2.childIterator(nodeTest5, false, nodePointer7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dOMNodePointer2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterator10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.w3c.dom.Node node0 = null;
        java.lang.String str2 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.findEnclosingAttribute(node0, "");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isCollection();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dOMNodePointer2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isAttribute();
        boolean boolean4 = dOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node8);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = dOMNodePointer2.childIterator(nodeTest5, false, nodePointer7);
        java.lang.String str12 = dOMNodePointer2.getNamespaceURI("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dOMNodePointer2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isCollection();
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = dOMNodePointer2.getNodeSetByKey(jXPathContext4, "", (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isAttribute();
        boolean boolean4 = dOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node8);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = dOMNodePointer2.childIterator(nodeTest5, false, nodePointer7);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = dOMNodePointer2.attributeIterator(qName11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterator10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isCollection();
        java.lang.Class<?> wildcardClass4 = dOMNodePointer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isCollection();
        java.lang.String str5 = dOMNodePointer2.getNamespaceURI("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isAttribute();
        boolean boolean4 = dOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node8);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = dOMNodePointer2.childIterator(nodeTest5, false, nodePointer7);
        java.lang.Object obj11 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer2.setValue(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterator10);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = dOMNodePointer2.getImmediateValuePointer();
        java.lang.Object obj4 = dOMNodePointer2.clone();
        boolean boolean5 = dOMNodePointer2.isRoot();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = dOMNodePointer2.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.XMLNS_NAMESPACE_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/xmlns/" + "'", str0, "http://www.w3.org/2000/xmlns/");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        boolean boolean2 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(node0, nodeTest1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isAttribute();
        boolean boolean4 = dOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node8);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = dOMNodePointer2.childIterator(nodeTest5, false, nodePointer7);
        java.lang.String str12 = dOMNodePointer2.getNamespaceURI("hi!");
        java.util.Locale locale13 = dOMNodePointer2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer2.printPointerChain();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(locale13);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = dOMNodePointer2.getImmediateValuePointer();
        java.lang.Object obj4 = dOMNodePointer2.getBaseValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dOMNodePointer2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = dOMNodePointer2.getImmediateValuePointer();
        java.lang.Object obj4 = dOMNodePointer2.getBaseValue();
        boolean boolean5 = dOMNodePointer2.isCollection();
        dOMNodePointer2.setAttribute(true);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = null;
        org.w3c.dom.Node node10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = dOMNodePointer11.getImmediateValuePointer();
        java.lang.Object obj13 = dOMNodePointer11.clone();
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, obj13, locale14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = null;
        org.w3c.dom.Node node17 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer16, node17);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = dOMNodePointer18.getImmediateValuePointer();
        java.lang.Object obj20 = dOMNodePointer18.getBaseValue();
        boolean boolean21 = dOMNodePointer18.isCollection();
        org.apache.commons.jxpath.JXPathContext jXPathContext22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = dOMNodePointer18.createPath(jXPathContext22);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = dOMNodePointer2.compareChildNodePointers(nodePointer15, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.jxpath.ri.model.dom.DOMNodePointer cannot be cast to org.w3c.dom.Node");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodePointer23);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = dOMNodePointer2.getImmediateValuePointer();
        dOMNodePointer2.setAttribute(true);
        java.lang.String str6 = dOMNodePointer2.getDefaultNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "http://www.w3.org/2000/xmlns/");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1);
        org.apache.commons.jxpath.JXPathContext jXPathContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer6 = dOMNodePointer2.getPointerByKey(jXPathContext3, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isAttribute();
        boolean boolean4 = dOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node8);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = dOMNodePointer2.childIterator(nodeTest5, false, nodePointer7);
        java.lang.String str12 = dOMNodePointer2.getNamespaceURI("hi!");
        java.util.Locale locale13 = dOMNodePointer2.getLocale();
        java.lang.Object obj14 = dOMNodePointer2.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isAttribute();
        boolean boolean4 = dOMNodePointer2.isCollection();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        java.lang.Object obj3 = dOMNodePointer2.getBaseValue();
        java.lang.Object obj4 = dOMNodePointer2.getImmediateNode();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = dOMNodePointer2.getImmediateValuePointer();
        java.lang.Object obj4 = dOMNodePointer2.getBaseValue();
        boolean boolean5 = dOMNodePointer2.isCollection();
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = dOMNodePointer2.createPath(jXPathContext6);
        boolean boolean8 = dOMNodePointer2.isCollection();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isAttribute();
        boolean boolean4 = dOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node8);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = dOMNodePointer2.childIterator(nodeTest5, false, nodePointer7);
        java.lang.String str12 = dOMNodePointer2.getNamespaceURI("hi!");
        java.lang.Object obj13 = dOMNodePointer2.getNode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = dOMNodePointer2.getImmediateValuePointer();
        java.lang.Object obj4 = dOMNodePointer2.getBaseValue();
        boolean boolean5 = dOMNodePointer2.isCollection();
        int int6 = dOMNodePointer2.getLength();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.w3c.dom.Node node1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node1);
        boolean boolean3 = dOMNodePointer2.isAttribute();
        boolean boolean4 = dOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node8);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = dOMNodePointer2.childIterator(nodeTest5, false, nodePointer7);
        java.lang.String str12 = dOMNodePointer2.getNamespaceURI("hi!");
        java.util.Locale locale13 = dOMNodePointer2.getLocale();
        int int14 = dOMNodePointer2.getLength();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(locale13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }
}

