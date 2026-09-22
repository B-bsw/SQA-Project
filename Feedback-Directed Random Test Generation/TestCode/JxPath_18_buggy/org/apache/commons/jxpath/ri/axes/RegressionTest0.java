package org.apache.commons.jxpath.ri.axes;

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
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.lang.Class<?> wildcardClass3 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext3 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet4 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext4 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.lang.String str3 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext4 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Empty expression context" + "'", str3, "Empty expression context");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeContext4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        attributeContext2.reset();
        java.lang.Class<?> wildcardClass4 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        attributeContext2.reset();
        int int4 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        attributeContext2.reset();
        int int4 = attributeContext2.getDocumentOrder();
        java.util.List list5 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        attributeContext2.reset();
        int int4 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.lang.String str3 = attributeContext2.toString();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext5 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Empty expression context" + "'", str3, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.lang.String str3 = attributeContext2.toString();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext5 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Empty expression context" + "'", str3, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        boolean boolean4 = attributeContext2.setPosition((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet5 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.lang.String str3 = attributeContext2.toString();
        boolean boolean5 = attributeContext2.setPosition(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Empty expression context" + "'", str3, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.lang.String str3 = attributeContext2.toString();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getPosition();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Empty expression context" + "'", str3, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.lang.String str3 = attributeContext2.toString();
        java.util.List list4 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Empty expression context" + "'", str3, "Empty expression context");
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        attributeContext2.reset();
        int int4 = attributeContext2.getPosition();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.util.List list5 = attributeContext4.getContextNodeList();
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.lang.String str3 = attributeContext2.toString();
        boolean boolean4 = attributeContext2.nextNode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Empty expression context" + "'", str3, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}

