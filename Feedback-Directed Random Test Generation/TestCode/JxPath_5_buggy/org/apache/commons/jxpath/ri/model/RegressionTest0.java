package org.apache.commons.jxpath.ri.model;

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
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.NodePointer.UNKNOWN_NAMESPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<<unknown namespace>>" + "'", str0, "<<unknown namespace>>");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName4, (java.lang.Object) (-1L), locale6);
        nodePointer7.printPointerChain();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) (-1L), locale11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = nodePointer3.compareChildNodePointers(nodePointer7, nodePointer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer12);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.createChild(jXPathContext6, qName7, 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an object for path -1/null[101], operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(namespaceResolver5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer8 = nodePointer3.getPointerByKey(jXPathContext5, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext4, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = nodePointer3.getNamespaceResolver();
        // The following exception was thrown during execution in test generation
        try {
            nodePointer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot remove an object that is not some other object's property or a collection element");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(namespaceResolver5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        nodePointer3.printPointerChain();
        java.util.Locale locale5 = null;
        nodePointer3.locale = locale5;
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) (-1L), locale9);
        nodePointer3.parent = nodePointer10;
        java.lang.String str13 = nodePointer3.getNamespaceURI("hi!");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) (-1L), locale8);
        int int10 = nodePointer9.index;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator11 = nodePointer3.childIterator(nodeTest4, true, nodePointer9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: PropertyIerator startWith parameter is not a child of the supplied parent");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2147483648) + "'", int10 == (-2147483648));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) (-1L), locale9);
        nodePointer3.parent = nodePointer10;
        boolean boolean13 = nodePointer10.isDefaultNamespace("<<unknown namespace>>");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        boolean boolean15 = nodePointer10.testNode(nodeTest14);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        boolean boolean7 = nodePointer3.testNode(nodeTest6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer3.getValuePointer();
        boolean boolean9 = nodePointer8.isCollection();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(namespaceResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        boolean boolean7 = nodePointer3.testNode(nodeTest6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer8.namespacePointer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            nodePointer8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot remove an object that is not some other object's property or a collection element");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(namespaceResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        boolean boolean7 = nodePointer3.testNode(nodeTest6);
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer3.createPath(jXPathContext8, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(namespaceResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        boolean boolean7 = nodePointer3.testNode(nodeTest6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer8.namespacePointer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator11 = nodePointer10.namespaceIterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(namespaceResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = nodePointer3.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = nodePointer11.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer11.createPath(jXPathContext13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) (-1L), locale17);
        nodePointer11.parent = nodePointer18;
        nodePointer3.parent = nodePointer18;
        nodePointer18.index = 0;
        org.apache.commons.jxpath.JXPathContext jXPathContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer26 = nodePointer18.getPointerByKey(jXPathContext23, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(nodeIterator7);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNull(namespaceResolver12);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = nodePointer3.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = nodePointer11.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer11.createPath(jXPathContext13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) (-1L), locale17);
        nodePointer11.parent = nodePointer18;
        nodePointer3.parent = nodePointer18;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer18.namespacePointer("<<unknown namespace>>");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(nodeIterator7);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNull(namespaceResolver12);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNull(nodePointer22);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) (-1L), locale9);
        nodePointer3.parent = nodePointer10;
        boolean boolean13 = nodePointer10.isDefaultNamespace("<<unknown namespace>>");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer10.parent;
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = nodePointer3.namespaceIterator();
        java.lang.String str8 = nodePointer3.getDefaultNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(nodeIterator7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        java.lang.Object obj7 = nodePointer3.getImmediateNode();
        nodePointer3.setIndex((int) (byte) 1);
        nodePointer3.setAttribute(true);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1L) + "'", obj7, (-1L));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = nodePointer3.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = nodePointer11.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer11.createPath(jXPathContext13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) (-1L), locale17);
        nodePointer11.parent = nodePointer18;
        nodePointer3.parent = nodePointer18;
        java.lang.String str21 = nodePointer3.asPath();
        // The following exception was thrown during execution in test generation
        try {
            nodePointer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot remove an object that is not some other object's property or a collection element");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(nodeIterator7);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNull(namespaceResolver12);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1/null" + "'", str21, "-1/null");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        nodePointer3.printPointerChain();
        boolean boolean5 = nodePointer3.isLeaf();
        int int6 = nodePointer3.index;
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        nodePointer3.printPointerChain();
        boolean boolean5 = nodePointer3.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer8 = nodePointer3.getPointerByID(jXPathContext6, "<<unknown namespace>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        boolean boolean7 = nodePointer3.testNode(nodeTest6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName11, (java.lang.Object) (-1L), locale13);
        int int15 = nodePointer14.index;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer14.namespacePointer("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = nodePointer3.childIterator(nodeTest9, true, nodePointer14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: PropertyIerator startWith parameter is not a child of the supplied parent");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(namespaceResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2147483648) + "'", int15 == (-2147483648));
        org.junit.Assert.assertNull(nodePointer17);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        nodePointer3.setAttribute(false);
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer3.createPath(jXPathContext7);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer8);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        java.lang.Object obj7 = nodePointer3.getImmediateNode();
        nodePointer3.setIndex((int) (byte) 1);
        nodePointer3.index = 1;
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1L) + "'", obj7, (-1L));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        boolean boolean7 = nodePointer3.testNode(nodeTest6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer3.getValuePointer();
        java.lang.Object obj9 = nodePointer3.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(namespaceResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) (-1L), locale9);
        nodePointer3.parent = nodePointer10;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = nodePointer3.getNamespaceResolver();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNull(namespaceResolver12);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        java.lang.Object obj7 = nodePointer3.getImmediateNode();
        nodePointer3.setIndex((int) (byte) 1);
        java.lang.String str10 = nodePointer3.getDefaultNamespaceURI();
        java.util.Locale locale11 = null;
        nodePointer3.locale = locale11;
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1L) + "'", obj7, (-1L));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = nodePointer3.attributeIterator(qName6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(namespaceResolver5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = nodePointer3.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = nodePointer11.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer11.createPath(jXPathContext13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) (-1L), locale17);
        nodePointer11.parent = nodePointer18;
        nodePointer3.parent = nodePointer18;
        nodePointer18.index = 0;
        org.apache.commons.jxpath.JXPathContext jXPathContext23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer18.createPath(jXPathContext23);
        org.apache.commons.jxpath.ri.QName qName25 = null;
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) (-1L), locale28);
        int int30 = nodePointer29.index;
        org.apache.commons.jxpath.JXPathContext jXPathContext31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = nodePointer29.createPath(jXPathContext31);
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName25, (java.lang.Object) nodePointer29, locale33);
        org.apache.commons.jxpath.ri.QName qName35 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName35, (java.lang.Object) (-1L), locale37);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver39 = nodePointer38.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext40 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = nodePointer38.createPath(jXPathContext40);
        org.apache.commons.jxpath.ri.QName qName42 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName42, (java.lang.Object) (-1L), locale44);
        nodePointer38.parent = nodePointer45;
        boolean boolean48 = nodePointer45.isDefaultNamespace("<<unknown namespace>>");
        // The following exception was thrown during execution in test generation
        try {
            int int49 = nodePointer24.compareChildNodePointers(nodePointer34, nodePointer45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(nodeIterator7);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNull(namespaceResolver12);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2147483648) + "'", int30 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNull(namespaceResolver39);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        boolean boolean7 = nodePointer3.testNode(nodeTest6);
        java.lang.Object obj8 = nodePointer3.getNodeValue();
        java.lang.String str9 = nodePointer3.getNamespaceURI();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer3.createPath(jXPathContext10);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(namespaceResolver5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(nodePointer11);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        boolean boolean4 = nodePointer3.isContainer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = nodePointer3.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = nodePointer11.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer11.createPath(jXPathContext13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) (-1L), locale17);
        nodePointer11.parent = nodePointer18;
        nodePointer3.parent = nodePointer18;
        nodePointer18.index = 0;
        org.apache.commons.jxpath.JXPathContext jXPathContext23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer18.createPath(jXPathContext23);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest25 = null;
        boolean boolean26 = nodePointer24.testNode(nodeTest25);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(nodeIterator7);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNull(namespaceResolver12);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        int int4 = nodePointer3.index;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.namespacePointer("");
        java.util.Locale locale7 = nodePointer3.getLocale();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.createPath(jXPathContext5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = nodePointer3.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = nodePointer11.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer11.createPath(jXPathContext13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) (-1L), locale17);
        nodePointer11.parent = nodePointer18;
        nodePointer3.parent = nodePointer18;
        java.lang.String str21 = nodePointer3.asPath();
        java.lang.Object obj22 = nodePointer3.clone();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(nodeIterator7);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNull(namespaceResolver12);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1/null" + "'", str21, "-1/null");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "-1/null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "-1/null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "-1/null");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1L), locale2);
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName5, (java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver9 = nodePointer8.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer8.createPath(jXPathContext10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) (-1L), locale14);
        nodePointer8.parent = nodePointer15;
        boolean boolean18 = nodePointer15.isDefaultNamespace("<<unknown namespace>>");
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) (-1L), locale21);
        nodePointer22.printPointerChain();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = nodePointer3.compareChildNodePointers(nodePointer15, nodePointer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNull(namespaceResolver9);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodePointer22);
    }
}

