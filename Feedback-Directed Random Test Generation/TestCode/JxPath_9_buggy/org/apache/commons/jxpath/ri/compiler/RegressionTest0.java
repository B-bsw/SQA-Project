package org.apache.commons.jxpath.ri.compiler;

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
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        java.lang.String str11 = coreOperationEqual10.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = coreOperationEqual2.equal(evalContext4, expression6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression6, expression7);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression7);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression1, expression4);
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = coreOperationNotEqual10.computeValue(evalContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression6, expression7);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression7);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression1, expression4);
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator12 = coreOperationNotEqual10.iterate(evalContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression6, expression7);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression7);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression1, expression4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = coreOperationNotEqual10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.EvalContext evalContext3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression8, expression9);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression11, expression12);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression9, expression12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = coreOperationEqual2.equal(evalContext3, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.EvalContext evalContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator4 = coreOperationEqual2.iteratePointers(evalContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        java.lang.Class<?> wildcardClass4 = coreOperationEqual2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray11 = coreOperationNotEqual10.getArguments();
        java.util.Iterator iterator12 = null;
        java.util.Iterator iterator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = coreOperationNotEqual10.findMatch(iterator12, iterator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray11);
        org.junit.Assert.assertArrayEquals(expressionArray11, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, expression4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = coreOperationEqual6.isContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray4 = coreOperationEqual2.getArguments();
        java.util.Iterator iterator5 = null;
        java.util.Iterator iterator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = coreOperationEqual2.findMatch(iterator5, iterator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertNotNull(expressionArray4);
        org.junit.Assert.assertArrayEquals(expressionArray4, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6);
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator10 = coreOperationEqual6.iterate(evalContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray4 = coreOperationEqual2.getArguments();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray5 = coreOperationEqual2.getArguments();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertNotNull(expressionArray4);
        org.junit.Assert.assertArrayEquals(expressionArray4, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertNotNull(expressionArray5);
        org.junit.Assert.assertArrayEquals(expressionArray5, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6);
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = coreOperationNotEqual8.computeValue(evalContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray9 = coreOperationEqual6.getArguments();
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray10 = coreOperationEqual6.getArguments();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator12 = coreOperationEqual6.iteratePointers(evalContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
        org.junit.Assert.assertNotNull(expressionArray9);
        org.junit.Assert.assertArrayEquals(expressionArray9, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertNotNull(expressionArray10);
        org.junit.Assert.assertArrayEquals(expressionArray10, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6);
        int int9 = coreOperationEqual6.getPrecedence();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray11 = coreOperationNotEqual10.getArguments();
        boolean boolean12 = coreOperationNotEqual10.isSymmetric();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator14 = coreOperationNotEqual10.iteratePointers(evalContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray11);
        org.junit.Assert.assertArrayEquals(expressionArray11, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6);
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = coreOperationEqual2.compute(evalContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        java.lang.Class<?> wildcardClass7 = coreOperationEqual6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray11 = coreOperationNotEqual10.getArguments();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = coreOperationNotEqual10.computeValue(evalContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray11);
        org.junit.Assert.assertArrayEquals(expressionArray11, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression2 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual3 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, expression2);
        java.lang.String str4 = coreOperationEqual3.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual3);
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator7 = coreOperationEqual3.iterate(evalContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, expression4);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6);
        java.lang.String str9 = coreOperationNotEqual8.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = coreOperationNotEqual8.computeValue(evalContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!=" + "'", str9, "!=");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6);
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = coreOperationEqual6.compute(evalContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, expression8);
        java.lang.String str11 = coreOperationNotEqual10.getSymbol();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!=" + "'", str11, "!=");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6);
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator10 = coreOperationEqual2.iterate(evalContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6);
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual11 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression9, expression10);
        java.lang.String str12 = coreOperationEqual11.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression13, expression14);
        java.lang.String str16 = coreOperationEqual15.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual17 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual11, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual15);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray18 = coreOperationEqual15.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "=" + "'", str12, "=");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "=" + "'", str16, "=");
        org.junit.Assert.assertNotNull(expressionArray18);
        org.junit.Assert.assertArrayEquals(expressionArray18, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator8 = coreOperationEqual6.iterate(evalContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression4, expression5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual6);
        boolean boolean9 = coreOperationEqual6.isSymmetric();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator11 = coreOperationEqual6.iterate(evalContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationEqual5);
        java.lang.String str7 = coreOperationEqual6.getSymbol();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=" + "'", str7, "=");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression3, expression4);
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual6 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression1, expression4);
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression7, expression8);
        org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual coreOperationNotEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual(expression4, expression8);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray11 = coreOperationNotEqual10.getArguments();
        java.lang.String str12 = coreOperationNotEqual10.getSymbol();
        org.junit.Assert.assertNotNull(expressionArray11);
        org.junit.Assert.assertArrayEquals(expressionArray11, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!=" + "'", str12, "!=");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationEqual coreOperationEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationEqual(expression0, expression1);
        java.lang.String str3 = coreOperationEqual2.getSymbol();
        java.lang.String str4 = coreOperationEqual2.getSymbol();
        java.util.Iterator iterator5 = null;
        java.util.Iterator iterator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = coreOperationEqual2.findMatch(iterator5, iterator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "=" + "'", str3, "=");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=" + "'", str4, "=");
    }
}

