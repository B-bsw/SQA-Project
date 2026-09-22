package org.apache.commons.jxpath.ri;

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
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = nodePointer3.getPointerByKey(jXPathContext4, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.lang.Object obj5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName4, obj5);
        nodePointer3.printPointerChain();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.XMLNS_NAMESPACE_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "http://www.w3.org/2000/xmlns/" + "'", str0, "http://www.w3.org/2000/xmlns/");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.lang.Object obj5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName4, obj5);
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = nodePointer6.getPointerByKey(jXPathContext7, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.NodePointer.UNKNOWN_NAMESPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<<unknown namespace>>" + "'", str0, "<<unknown namespace>>");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dOMNodePointer15.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        java.lang.Object obj16 = dOMNodePointer15.getBaseValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = null;
        org.apache.commons.jxpath.ri.QName qName18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = dOMNodePointer15.createChild(jXPathContext17, qName18, (int) (byte) 10, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dOMNodePointer15.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        java.lang.Object obj16 = dOMNodePointer15.getBaseValue();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        boolean boolean16 = dOMNodePointer15.isRoot();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver6);
        java.lang.Class<?> wildcardClass8 = nodePointer3.getClass();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer15.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName18, (java.lang.Object) 'a', locale20);
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName22, (java.lang.Object) 'a', locale24);
        nodePointer25.setIndex(1);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver28 = nodePointer25.getNamespaceResolver();
        int int29 = nodePointer25.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            int int30 = dOMNodePointer15.compareChildNodePointers(nodePointer21, nodePointer25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to org.w3c.dom.Node");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNull(namespaceResolver28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer9.createPath(jXPathContext14, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.lang.Object obj5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName4, obj5);
        java.lang.Object obj7 = nodePointer3.getNodeValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.createPath(jXPathContext8);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertNotNull(nodePointer9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        boolean boolean16 = nodePointer9.isContainer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer15.namespacePointer("hi!");
        boolean boolean18 = dOMNodePointer15.isActual();
        java.lang.Object obj19 = dOMNodePointer15.getNodeValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = dOMNodePointer15.createPath(jXPathContext20, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        boolean boolean14 = nodePointer3.isNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer15.namespacePointer("hi!");
        boolean boolean18 = dOMNodePointer15.isActual();
        java.lang.Object obj19 = dOMNodePointer15.getNodeValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dOMNodePointer15.asPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer15.namespacePointer("hi!");
        boolean boolean18 = dOMNodePointer15.isActual();
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 'a', locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.lang.Object obj24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer22, qName23, obj24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) 'a', locale28);
        nodePointer29.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName32 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName32, (java.lang.Object) 'a', locale34);
        org.apache.commons.jxpath.ri.QName qName36 = null;
        java.lang.Object obj37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer35, qName36, obj37);
        int int39 = nodePointer29.compareTo((java.lang.Object) nodePointer35);
        org.w3c.dom.Node node40 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer41 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer35, node40);
        java.lang.Object obj42 = dOMNodePointer41.getBaseValue();
        int int43 = dOMNodePointer15.compareChildNodePointers(nodePointer25, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = dOMNodePointer41.asPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 'a', locale3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.lang.Object obj6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer4, qName5, obj6);
        java.lang.Object obj8 = nodePointer4.getNodeValue();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, obj8, locale9);
        java.lang.Object obj11 = nodePointer10.getRootNode();
        boolean boolean12 = nodePointer10.isAttribute();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer15.namespacePointer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dOMNodePointer15.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer17);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        java.lang.Object obj16 = dOMNodePointer15.getBaseValue();
        java.lang.String str17 = dOMNodePointer15.getDefaultNamespaceURI();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dOMNodePointer15.asPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) "hi!", locale2);
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer15.namespacePointer("hi!");
        java.lang.Object obj18 = dOMNodePointer15.getImmediateNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer15.namespacePointer("hi!");
        boolean boolean18 = dOMNodePointer15.isActual();
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 'a', locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.lang.Object obj24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer22, qName23, obj24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) 'a', locale28);
        nodePointer29.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName32 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName32, (java.lang.Object) 'a', locale34);
        org.apache.commons.jxpath.ri.QName qName36 = null;
        java.lang.Object obj37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer35, qName36, obj37);
        int int39 = nodePointer29.compareTo((java.lang.Object) nodePointer35);
        org.w3c.dom.Node node40 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer41 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer35, node40);
        java.lang.Object obj42 = dOMNodePointer41.getBaseValue();
        int int43 = dOMNodePointer15.compareChildNodePointers(nodePointer25, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer41);
        java.lang.Object obj44 = nodePointer25.getNodeValue();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer15.namespacePointer("hi!");
        boolean boolean18 = dOMNodePointer15.isActual();
        java.lang.Object obj19 = dOMNodePointer15.getNodeValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = dOMNodePointer15.testNode(nodeTest20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = dOMNodePointer15.isLanguage("<<unknown namespace>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        java.lang.Object obj16 = dOMNodePointer15.getBaseValue();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer15.setValue((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 'a', locale3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.lang.Object obj6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer4, qName5, obj6);
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer7, locale8);
        java.lang.String str10 = nodePointer7.toString();
        java.util.Locale locale11 = nodePointer7.getLocale();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/null" + "'", str10, "/null");
        org.junit.Assert.assertNull(locale11);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer15.namespacePointer("hi!");
        boolean boolean18 = dOMNodePointer15.isActual();
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 'a', locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.lang.Object obj24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer22, qName23, obj24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) 'a', locale28);
        nodePointer29.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName32 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName32, (java.lang.Object) 'a', locale34);
        org.apache.commons.jxpath.ri.QName qName36 = null;
        java.lang.Object obj37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer35, qName36, obj37);
        int int39 = nodePointer29.compareTo((java.lang.Object) nodePointer35);
        org.w3c.dom.Node node40 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer41 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer35, node40);
        java.lang.Object obj42 = dOMNodePointer41.getBaseValue();
        int int43 = dOMNodePointer15.compareChildNodePointers(nodePointer25, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName44 = dOMNodePointer15.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        java.lang.Object obj16 = dOMNodePointer15.getBaseValue();
        java.lang.String str17 = dOMNodePointer15.getDefaultNamespaceURI();
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = null;
        org.apache.commons.jxpath.ri.QName qName19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = dOMNodePointer15.createChild(jXPathContext18, qName19, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer15.namespacePointer("hi!");
        boolean boolean18 = dOMNodePointer15.isActual();
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 'a', locale21);
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.lang.Object obj24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer22, qName23, obj24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) 'a', locale28);
        nodePointer29.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName32 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName32, (java.lang.Object) 'a', locale34);
        org.apache.commons.jxpath.ri.QName qName36 = null;
        java.lang.Object obj37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer35, qName36, obj37);
        int int39 = nodePointer29.compareTo((java.lang.Object) nodePointer35);
        org.w3c.dom.Node node40 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer41 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer35, node40);
        java.lang.Object obj42 = dOMNodePointer41.getBaseValue();
        int int43 = dOMNodePointer15.compareChildNodePointers(nodePointer25, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer41);
        org.apache.commons.jxpath.JXPathContext jXPathContext44 = null;
        org.apache.commons.jxpath.ri.QName qName45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = dOMNodePointer41.createChild(jXPathContext44, qName45, 0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        java.lang.Object obj16 = dOMNodePointer15.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = dOMNodePointer15.namespacePointer("hi!");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(nodePointer18);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 'a', locale2);
        nodePointer3.setIndex(1);
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 'a', locale8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.lang.Object obj11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName10, obj11);
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer15.namespacePointer("hi!");
        boolean boolean18 = dOMNodePointer15.isActual();
        boolean boolean20 = dOMNodePointer15.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.w3c.dom.Node node0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        boolean boolean2 = org.apache.commons.jxpath.ri.model.dom.DOMNodePointer.testNode(node0, nodeTest1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }
}

