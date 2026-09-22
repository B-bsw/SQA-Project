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
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = coreFunction2.functionSum(evalContext4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        int int4 = coreFunction2.getFunctionCode();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = coreFunction2.functionNumber(evalContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = coreFunction2.functionConcat(evalContext4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        int int4 = coreFunction2.getFunctionCode();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = coreFunction2.functionString(evalContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        org.apache.commons.jxpath.ri.EvalContext evalContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator4 = coreFunction2.iteratePointers(evalContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = coreFunction2.functionSubstringAfter(evalContext4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator5 = coreFunction2.iterate(evalContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        int int4 = coreFunction2.getFunctionCode();
        int int5 = coreFunction2.getArgumentCount();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = coreFunction2.functionConcat(evalContext6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        int int4 = coreFunction2.getFunctionCode();
        int int5 = coreFunction2.getArgumentCount();
        int int6 = coreFunction2.getArgumentCount();
        java.lang.Class<?> wildcardClass7 = coreFunction2.getClass();
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        int int4 = coreFunction2.getFunctionCode();
        int int5 = coreFunction2.getArgumentCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.compiler.Expression expression6 = coreFunction2.getArg1();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = coreFunction2.functionFloor(evalContext4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        java.lang.Object obj5 = coreFunction2.functionNull(evalContext4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        java.lang.Class<?> wildcardClass3 = coreFunction2.getClass();
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = coreFunction2.functionID(evalContext4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = coreFunction2.functionNamespaceURI(evalContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = coreFunction2.functionSubstring(evalContext4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = coreFunction2.functionCeiling(evalContext4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        int int4 = coreFunction2.getFunctionCode();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = coreFunction2.functionCeiling(evalContext5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        int int4 = coreFunction2.getFunctionCode();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = coreFunction2.functionSum(evalContext5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        org.apache.commons.jxpath.ri.EvalContext evalContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = coreFunction2.functionNumber(evalContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        java.lang.Object obj5 = coreFunction2.functionNull(evalContext4);
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = coreFunction2.functionCount(evalContext6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        int int4 = coreFunction2.getFunctionCode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.compiler.Expression expression5 = coreFunction2.getArg2();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        int int4 = coreFunction2.getFunctionCode();
        int int5 = coreFunction2.getArgumentCount();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = coreFunction2.computeValue(evalContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        java.lang.Object obj5 = coreFunction2.functionNull(evalContext4);
        boolean boolean6 = coreFunction2.isContextDependent();
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        int int4 = coreFunction2.getFunctionCode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.compiler.Expression expression5 = coreFunction2.getArg3();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        java.lang.Object obj5 = coreFunction2.functionNull(evalContext4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.compiler.Expression expression6 = coreFunction2.getArg2();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        int int4 = coreFunction2.getFunctionCode();
        int int5 = coreFunction2.getArgumentCount();
        int int6 = coreFunction2.getArgumentCount();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = coreFunction2.functionLocalName(evalContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        org.apache.commons.jxpath.ri.EvalContext evalContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = coreFunction2.functionPosition(evalContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray1 = new org.apache.commons.jxpath.ri.compiler.Expression[] {};
        org.apache.commons.jxpath.ri.compiler.CoreFunction coreFunction2 = new org.apache.commons.jxpath.ri.compiler.CoreFunction(1, expressionArray1);
        boolean boolean3 = coreFunction2.computeContextDependent();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = coreFunction2.functionBoolean(evalContext4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathInvalidSyntaxException; message: Incorrect number of arguments: last()");
        } catch (org.apache.commons.jxpath.JXPathInvalidSyntaxException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(expressionArray1);
        org.junit.Assert.assertArrayEquals(expressionArray1, new org.apache.commons.jxpath.ri.compiler.Expression[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }
}

