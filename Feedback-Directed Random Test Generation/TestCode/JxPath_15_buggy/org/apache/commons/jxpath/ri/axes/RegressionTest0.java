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
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unionContext3.setPosition(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unionContext3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        java.lang.Class<?> wildcardClass10 = unionContext3.getClass();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext9 = unionContext3.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext12 = unionContext3.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            unionContext3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = unionContext3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        int int23 = unionContext22.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = unionContext22.nextNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unionContext3.nextNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        int int13 = unionContext3.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext14 = unionContext3.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = unionContext3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        boolean boolean10 = unionContext3.nextSet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = unionContext3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        int int23 = unionContext22.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list24 = unionContext22.getContextNodeList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        int int13 = unionContext3.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            unionContext3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        boolean boolean12 = unionContext3.nextSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = unionContext3.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        boolean boolean10 = unionContext3.nextSet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = unionContext3.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list23 = unionContext22.getContextNodeList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        unionContext3.reset();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        int int23 = unionContext22.getDocumentOrder();
        boolean boolean24 = unionContext22.nextSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = unionContext22.setPosition(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer13 = unionContext3.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        int int23 = unionContext22.getDocumentOrder();
        java.lang.Object obj24 = unionContext22.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer25 = unionContext22.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        boolean boolean12 = unionContext3.isChildOrderingRequired();
        int int13 = unionContext3.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list14 = unionContext3.getContextNodeList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        int int13 = unionContext3.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray16 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext15 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext17 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext14, evalContextArray16);
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext19 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext18, evalContextArray20);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext17, evalContextArray20);
        int int23 = unionContext17.getCurrentPosition();
        int int24 = unionContext17.getDocumentOrder();
        int int25 = unionContext17.getCurrentPosition();
        int int26 = unionContext17.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext27 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext28 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext27, evalContextArray29);
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext32 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext32 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext31, evalContextArray33);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext30, evalContextArray33);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext17, evalContextArray33);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray33);
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(evalContextArray16);
        org.junit.Assert.assertArrayEquals(evalContextArray16, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertArrayEquals(evalContextArray33, new org.apache.commons.jxpath.ri.EvalContext[] { null });
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.NodeSet nodeSet10 = unionContext3.getNodeSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer11 = unionContext3.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeSet10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        int int13 = unionContext3.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = unionContext3.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        int int13 = unionContext3.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unionContext3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        boolean boolean10 = unionContext3.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = unionContext3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        boolean boolean12 = unionContext3.isChildOrderingRequired();
        int int13 = unionContext3.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = unionContext3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        java.lang.Object obj11 = unionContext3.getValue();
        unionContext3.reset();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "[]");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        boolean boolean10 = unionContext3.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer11 = unionContext3.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        boolean boolean12 = unionContext3.isChildOrderingRequired();
        int int13 = unionContext3.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = unionContext3.setPosition((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = unionContext3.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        int int13 = unionContext3.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer14 = unionContext3.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        int int23 = unionContext22.getDocumentOrder();
        boolean boolean24 = unionContext22.nextSet();
        org.apache.commons.jxpath.Pointer pointer25 = unionContext22.getSingleNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(pointer25);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = unionContext22.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        boolean boolean10 = unionContext3.isChildOrderingRequired();
        int int11 = unionContext3.getDocumentOrder();
        boolean boolean12 = unionContext3.nextSet();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.NodeSet nodeSet10 = unionContext3.getNodeSet();
        int int11 = unionContext3.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = unionContext3.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        java.lang.Object obj23 = unionContext22.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext24 = unionContext22.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        boolean boolean12 = unionContext3.nextSet();
        int int13 = unionContext3.getPosition();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        boolean boolean12 = unionContext3.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext13 = unionContext3.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = unionContext3.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.NodeSet nodeSet10 = unionContext3.getNodeSet();
        boolean boolean11 = unionContext3.nextSet();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(nodeSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        java.lang.Object obj4 = unionContext3.getValue();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext8.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unionContext8.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = unionContext3.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = unionContext3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = unionContext3.setPosition(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list4 = unionContext3.getContextNodeList();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        boolean boolean10 = unionContext3.isChildOrderingRequired();
        int int11 = unionContext3.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = unionContext3.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = unionContext3.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = unionContext3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        int int23 = unionContext22.getDocumentOrder();
        java.lang.Object obj24 = unionContext22.getValue();
        java.lang.Object obj25 = unionContext22.getValue();
        int int26 = unionContext22.getPosition();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        int int23 = unionContext22.getDocumentOrder();
        java.lang.Object obj24 = unionContext22.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet25 = unionContext22.getNodeSet();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
        org.junit.Assert.assertNotNull(nodeSet25);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getDocumentOrder();
        boolean boolean12 = unionContext3.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = unionContext3.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        int int23 = unionContext22.getDocumentOrder();
        java.lang.Object obj24 = unionContext22.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext25 = unionContext22.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        int int12 = unionContext3.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext14 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray15);
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray19);
        java.lang.Object obj23 = unionContext22.getValue();
        boolean boolean24 = unionContext22.nextSet();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = unionContext22.setPosition((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext1 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray2);
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray6);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray6);
        int int9 = unionContext3.getCurrentPosition();
        int int10 = unionContext3.getDocumentOrder();
        int int11 = unionContext3.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = unionContext3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] { null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }
}

