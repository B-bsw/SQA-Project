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
        int int0 = org.apache.commons.jxpath.ri.model.beans.PropertyPointer.UNSPECIFIED_PROPERTY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-2147483648) + "'", int0 == (-2147483648));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = null;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer7, qName8, (java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator11 = nodePointer3.childIterator(nodeTest5, true, nodePointer10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: PropertyIerator startWith parameter is not a child of the supplied parent");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodePointer10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = nodePointer3.isLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler7 = null;
        nodePointer3.setExceptionHandler(exceptionHandler7);
        java.util.Locale locale9 = nodePointer3.getLocale();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(locale9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Object obj7 = nodePointer3.clone();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = nodePointer3.isLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Object obj7 = nodePointer3.clone();
        java.lang.Object obj8 = nodePointer3.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer3.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.QName qName11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = nodePointer10.attributeIterator(qName11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        nodePointer3.setIndex((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = nodePointer3.isLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Object obj7 = nodePointer3.clone();
        java.lang.Object obj8 = nodePointer3.getNode();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler9 = null;
        nodePointer3.setExceptionHandler(exceptionHandler9);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Object obj7 = nodePointer3.clone();
        int int8 = nodePointer3.getIndex();
        boolean boolean9 = nodePointer3.isNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Object obj7 = nodePointer3.clone();
        java.lang.Object obj8 = nodePointer3.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer3.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer11, qName12, (java.lang.Object) 1L);
        boolean boolean15 = nodePointer14.isNode();
        java.lang.String str17 = nodePointer14.getNamespaceURI("");
        // The following exception was thrown during execution in test generation
        try {
            int int18 = nodePointer10.compareTo((java.lang.Object) nodePointer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        nodePointer3.setIndex((int) (short) 1);
        nodePointer3.setIndex(100);
        nodePointer3.setIndex((int) (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler7 = null;
        nodePointer3.setExceptionHandler(exceptionHandler7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.getImmediateParentPointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = nodePointer9.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        nodePointer3.setIndex((int) (short) 1);
        boolean boolean11 = nodePointer3.isRoot();
        boolean boolean12 = nodePointer3.isAttribute();
        java.lang.Object obj13 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer3.namespacePointer("");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1L + "'", obj13, 1L);
        org.junit.Assert.assertNull(nodePointer15);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        nodePointer3.setIndex((int) (short) 1);
        nodePointer3.setIndex(100);
        java.lang.Throwable throwable13 = null;
        nodePointer3.handle(throwable13);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 1L, locale2);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str0 = org.apache.commons.jxpath.ri.model.NodePointer.UNKNOWN_NAMESPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "<<unknown namespace>>" + "'", str0, "<<unknown namespace>>");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Object obj7 = nodePointer3.clone();
        int int8 = nodePointer3.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = nodePointer3.isLanguage("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        java.lang.Object obj9 = nodePointer3.getValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator13 = nodePointer3.childIterator(nodeTest10, true, nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertNotNull(nodeIterator13);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        nodePointer3.setIndex((int) (short) 1);
        boolean boolean11 = nodePointer3.isRoot();
        boolean boolean12 = nodePointer3.isAttribute();
        java.lang.Object obj13 = nodePointer3.getRootNode();
        java.lang.Object obj14 = nodePointer3.getBaseValue();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1L + "'", obj13, 1L);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1L + "'", obj14, 1L);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        nodePointer3.setIndex((int) (short) 1);
        boolean boolean11 = nodePointer3.isRoot();
        boolean boolean12 = nodePointer3.isAttribute();
        nodePointer3.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = nodePointer3.namespaceIterator();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodeIterator15);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        java.lang.Object obj9 = nodePointer3.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = nodePointer3.namespaceIterator();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertNull(nodeIterator10);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        nodePointer3.setIndex((int) (short) 1);
        boolean boolean11 = nodePointer3.isRoot();
        boolean boolean12 = nodePointer3.isAttribute();
        java.lang.Object obj13 = nodePointer3.getRootNode();
        java.util.Locale locale14 = nodePointer3.getLocale();
        java.lang.String str15 = nodePointer3.asPath();
        boolean boolean16 = nodePointer3.isAttribute();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1L + "'", obj13, 1L);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        nodePointer3.setIndex((int) (short) 1);
        boolean boolean11 = nodePointer3.isRoot();
        boolean boolean12 = nodePointer3.isAttribute();
        java.lang.Object obj13 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = nodePointer3.namespaceIterator();
        java.lang.Object obj15 = nodePointer3.getValue();
        nodePointer3.setIndex((int) (byte) 1);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1L + "'", obj13, 1L);
        org.junit.Assert.assertNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1L + "'", obj15, 1L);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        nodePointer3.setIndex((int) (short) 1);
        boolean boolean11 = nodePointer3.isRoot();
        boolean boolean12 = nodePointer3.isAttribute();
        java.lang.Object obj13 = nodePointer3.getRootNode();
        java.util.Locale locale14 = nodePointer3.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer3.namespacePointer("hi!");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1L + "'", obj13, 1L);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNull(nodePointer16);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler7 = null;
        nodePointer3.setExceptionHandler(exceptionHandler7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = null;
        org.apache.commons.jxpath.ri.QName qName11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer10, qName11, (java.lang.Object) 1L);
        boolean boolean14 = nodePointer13.isNode();
        java.lang.String str16 = nodePointer13.getNamespaceURI("");
        java.lang.Throwable throwable17 = null;
        nodePointer13.handle(throwable17);
        nodePointer13.setIndex((int) (short) 1);
        boolean boolean21 = nodePointer13.isRoot();
        boolean boolean22 = nodePointer13.isAttribute();
        java.lang.Object obj23 = nodePointer13.getRootNode();
        java.util.Locale locale24 = nodePointer13.getLocale();
        java.lang.String str25 = nodePointer13.asPath();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = nodePointer9.compareTo((java.lang.Object) str25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1L + "'", obj23, 1L);
        org.junit.Assert.assertNull(locale24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100L, locale2);
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Throwable throwable7 = null;
        nodePointer3.handle(throwable7);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler9 = null;
        nodePointer3.setExceptionHandler(exceptionHandler9);
        boolean boolean11 = nodePointer3.isContainer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler7 = null;
        nodePointer3.setExceptionHandler(exceptionHandler7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.getImmediateParentPointer();
        java.lang.Object obj10 = nodePointer3.getNode();
        nodePointer3.setIndex((int) (short) 0);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Object obj7 = nodePointer3.clone();
        java.lang.Object obj8 = nodePointer3.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer3.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.QName qName11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = nodePointer3.attributeIterator(qName11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) 1L);
        boolean boolean4 = nodePointer3.isNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI("");
        java.lang.Object obj7 = nodePointer3.clone();
        int int8 = nodePointer3.getIndex();
        java.lang.Object obj9 = nodePointer3.getBaseValue();
        java.lang.Throwable throwable10 = null;
        nodePointer3.handle(throwable10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        boolean boolean13 = nodePointer3.testNode(nodeTest12);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }
}

