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
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.EvalContext evalContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = coreOperationLessThanOrEqual2.compute(evalContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        int int13 = coreOperationLessThanOrEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, expression5);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = coreOperationGreaterThan15.computeValue(evalContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = coreOperationLessThanOrEqual2.isContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = coreOperationLessThanOrEqual2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        int int13 = coreOperationLessThanOrEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, expression5);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator17 = coreOperationGreaterThan15.iteratePointers(evalContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.EvalContext evalContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = coreOperationLessThanOrEqual2.computeValue(evalContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression3, expression4);
        java.lang.String str6 = coreOperationLessThanOrEqual5.getSymbol();
        boolean boolean7 = coreOperationLessThanOrEqual5.isSymmetric();
        int int8 = coreOperationLessThanOrEqual5.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression0, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual5);
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator11 = coreOperationLessThanOrEqual5.iteratePointers(evalContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<=" + "'", str6, "<=");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = coreOperationLessThanOrEqual2.isContextDependent();
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
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = coreOperationLessThanOrEqual2.compute(evalContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        int int5 = coreOperationLessThanOrEqual2.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression6, expression7);
        java.lang.String str9 = coreOperationLessThanOrEqual8.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = coreOperationLessThan10.isContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<=" + "'", str9, "<=");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        int int5 = coreOperationLessThanOrEqual2.getPrecedence();
        int int6 = coreOperationLessThanOrEqual2.getPrecedence();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator8 = coreOperationLessThanOrEqual2.iteratePointers(evalContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        int int5 = coreOperationLessThanOrEqual2.getPrecedence();
        int int6 = coreOperationLessThanOrEqual2.getPrecedence();
        boolean boolean7 = coreOperationLessThanOrEqual2.isSymmetric();
        java.lang.Class<?> wildcardClass8 = coreOperationLessThanOrEqual2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        int int5 = coreOperationLessThanOrEqual2.getPrecedence();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = coreOperationLessThanOrEqual2.computeValue(evalContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        int int5 = coreOperationLessThanOrEqual2.getPrecedence();
        int int6 = coreOperationLessThanOrEqual2.getPrecedence();
        boolean boolean7 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression13, expression14);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression16, expression17);
        java.lang.String str19 = coreOperationLessThanOrEqual18.getSymbol();
        boolean boolean20 = coreOperationLessThanOrEqual18.isSymmetric();
        int int21 = coreOperationLessThanOrEqual18.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual18);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10, expression13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationGreaterThan23);
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator26 = coreOperationGreaterThan23.iterate(evalContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<=" + "'", str19, "<=");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        int int13 = coreOperationLessThanOrEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression16, expression17);
        java.lang.String str19 = coreOperationLessThanOrEqual18.getSymbol();
        boolean boolean20 = coreOperationLessThanOrEqual18.isSymmetric();
        int int21 = coreOperationLessThanOrEqual18.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression22, expression23);
        java.lang.String str25 = coreOperationLessThanOrEqual24.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThan26);
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = coreOperationLessThan26.computeValue(evalContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<=" + "'", str19, "<=");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<=" + "'", str25, "<=");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression3, expression4);
        java.lang.String str6 = coreOperationLessThanOrEqual5.getSymbol();
        boolean boolean7 = coreOperationLessThanOrEqual5.isSymmetric();
        int int8 = coreOperationLessThanOrEqual5.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression0, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual5);
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = coreOperationLessThan9.computeValue(evalContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<=" + "'", str6, "<=");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        java.lang.String str8 = coreOperationLessThanOrEqual7.getSymbol();
        boolean boolean9 = coreOperationLessThanOrEqual7.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression10 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual12 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression10, expression11);
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression13, expression14);
        java.lang.String str16 = coreOperationLessThanOrEqual15.getSymbol();
        boolean boolean17 = coreOperationLessThanOrEqual15.isSymmetric();
        int int18 = coreOperationLessThanOrEqual15.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan19 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression10, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual15);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual7, expression10);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray21 = coreOperationLessThanOrEqual7.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual7);
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = coreOperationLessThanOrEqual7.compute(evalContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<=" + "'", str8, "<=");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<=" + "'", str16, "<=");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(expressionArray21);
        org.junit.Assert.assertArrayEquals(expressionArray21, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        int int13 = coreOperationLessThanOrEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, expression5);
        java.lang.String str16 = coreOperationLessThanOrEqual2.getSymbol();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<=" + "'", str16, "<=");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.compiler.Expression expression3 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression4 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual5 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression3, expression4);
        java.lang.String str6 = coreOperationLessThanOrEqual5.getSymbol();
        boolean boolean7 = coreOperationLessThanOrEqual5.isSymmetric();
        int int8 = coreOperationLessThanOrEqual5.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan9 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression0, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual5);
        int int10 = coreOperationLessThan9.getPrecedence();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<=" + "'", str6, "<=");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        org.apache.commons.jxpath.ri.EvalContext evalContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator4 = coreOperationLessThanOrEqual2.iteratePointers(evalContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        int int13 = coreOperationLessThanOrEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression16, expression17);
        java.lang.String str19 = coreOperationLessThanOrEqual18.getSymbol();
        boolean boolean20 = coreOperationLessThanOrEqual18.isSymmetric();
        int int21 = coreOperationLessThanOrEqual18.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression22, expression23);
        java.lang.String str25 = coreOperationLessThanOrEqual24.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThan26);
        java.lang.String str28 = coreOperationGreaterThan27.getSymbol();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<=" + "'", str19, "<=");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<=" + "'", str25, "<=");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ">" + "'", str28, ">");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        int int13 = coreOperationLessThanOrEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression16, expression17);
        java.lang.String str19 = coreOperationLessThanOrEqual18.getSymbol();
        boolean boolean20 = coreOperationLessThanOrEqual18.isSymmetric();
        int int21 = coreOperationLessThanOrEqual18.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression22 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression23 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression22, expression23);
        java.lang.String str25 = coreOperationLessThanOrEqual24.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual18, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan27 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThan26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = coreOperationLessThan26.isContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<=" + "'", str19, "<=");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<=" + "'", str25, "<=");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        int int5 = coreOperationLessThanOrEqual2.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression6, expression7);
        java.lang.String str9 = coreOperationLessThanOrEqual8.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual8);
        java.lang.String str11 = coreOperationLessThan10.getSymbol();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = coreOperationLessThan10.compute(evalContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<=" + "'", str9, "<=");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<" + "'", str11, "<");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        int int5 = coreOperationLessThanOrEqual2.getPrecedence();
        int int6 = coreOperationLessThanOrEqual2.getPrecedence();
        boolean boolean7 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression13 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression14 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression13, expression14);
        org.apache.commons.jxpath.ri.compiler.Expression expression16 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression17 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual18 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression16, expression17);
        java.lang.String str19 = coreOperationLessThanOrEqual18.getSymbol();
        boolean boolean20 = coreOperationLessThanOrEqual18.isSymmetric();
        int int21 = coreOperationLessThanOrEqual18.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan22 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual18);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan23 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10, expression13);
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual24 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationGreaterThan23);
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = coreOperationGreaterThan23.computeValue(evalContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<=" + "'", str19, "<=");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        int int13 = coreOperationLessThanOrEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, expression5);
        java.lang.String str16 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean17 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression18, expression19);
        java.lang.String str21 = coreOperationLessThanOrEqual20.getSymbol();
        boolean boolean22 = coreOperationLessThanOrEqual20.isSymmetric();
        int int23 = coreOperationLessThanOrEqual20.getPrecedence();
        int int24 = coreOperationLessThanOrEqual20.getPrecedence();
        boolean boolean25 = coreOperationLessThanOrEqual20.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression26, expression27);
        java.lang.String str29 = coreOperationLessThanOrEqual28.getSymbol();
        boolean boolean30 = coreOperationLessThanOrEqual28.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression34, expression35);
        java.lang.String str37 = coreOperationLessThanOrEqual36.getSymbol();
        boolean boolean38 = coreOperationLessThanOrEqual36.isSymmetric();
        int int39 = coreOperationLessThanOrEqual36.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual28, expression31);
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual20, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationGreaterThan41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationGreaterThan41);
        org.apache.commons.jxpath.ri.EvalContext evalContext44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator45 = coreOperationGreaterThanOrEqual43.iteratePointers(evalContext44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<=" + "'", str16, "<=");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<=" + "'", str21, "<=");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<=" + "'", str29, "<=");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<=" + "'", str37, "<=");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        int int13 = coreOperationLessThanOrEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, expression5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = coreOperationLessThanOrEqual2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        int int13 = coreOperationLessThanOrEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray16 = coreOperationLessThanOrEqual2.getArguments();
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator iterator18 = coreOperationLessThanOrEqual2.iteratePointers(evalContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(expressionArray16);
        org.junit.Assert.assertArrayEquals(expressionArray16, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        int int13 = coreOperationLessThanOrEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, expression5);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray16 = coreOperationLessThanOrEqual2.getArguments();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = coreOperationLessThanOrEqual2.isContextDependent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(expressionArray16);
        org.junit.Assert.assertArrayEquals(expressionArray16, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression5 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual7 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression5, expression6);
        org.apache.commons.jxpath.ri.compiler.Expression expression8 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression9 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression8, expression9);
        java.lang.String str11 = coreOperationLessThanOrEqual10.getSymbol();
        boolean boolean12 = coreOperationLessThanOrEqual10.isSymmetric();
        int int13 = coreOperationLessThanOrEqual10.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan14 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression5, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual10);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan15 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, expression5);
        java.lang.String str16 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean17 = coreOperationLessThanOrEqual2.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression18 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual20 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression18, expression19);
        java.lang.String str21 = coreOperationLessThanOrEqual20.getSymbol();
        boolean boolean22 = coreOperationLessThanOrEqual20.isSymmetric();
        int int23 = coreOperationLessThanOrEqual20.getPrecedence();
        int int24 = coreOperationLessThanOrEqual20.getPrecedence();
        boolean boolean25 = coreOperationLessThanOrEqual20.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression26 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual28 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression26, expression27);
        java.lang.String str29 = coreOperationLessThanOrEqual28.getSymbol();
        boolean boolean30 = coreOperationLessThanOrEqual28.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression31 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression32 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression31, expression32);
        org.apache.commons.jxpath.ri.compiler.Expression expression34 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression35 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual36 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression34, expression35);
        java.lang.String str37 = coreOperationLessThanOrEqual36.getSymbol();
        boolean boolean38 = coreOperationLessThanOrEqual36.isSymmetric();
        int int39 = coreOperationLessThanOrEqual36.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression31, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual36);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan41 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual28, expression31);
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual42 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual20, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationGreaterThan41);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual43 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationGreaterThan41);
        org.apache.commons.jxpath.ri.EvalContext evalContext44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = coreOperationLessThanOrEqual2.compute(evalContext44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<=" + "'", str11, "<=");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<=" + "'", str16, "<=");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<=" + "'", str21, "<=");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<=" + "'", str29, "<=");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "<=" + "'", str37, "<=");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        int int5 = coreOperationLessThanOrEqual2.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression6, expression7);
        java.lang.String str9 = coreOperationLessThanOrEqual8.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual8);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression11, expression12);
        java.lang.String str14 = coreOperationLessThanOrEqual13.getSymbol();
        boolean boolean15 = coreOperationLessThanOrEqual13.isSymmetric();
        int int16 = coreOperationLessThanOrEqual13.getPrecedence();
        int int17 = coreOperationLessThanOrEqual13.getPrecedence();
        boolean boolean18 = coreOperationLessThanOrEqual13.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression19, expression20);
        java.lang.String str22 = coreOperationLessThanOrEqual21.getSymbol();
        boolean boolean23 = coreOperationLessThanOrEqual21.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression24, expression25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression27, expression28);
        java.lang.String str30 = coreOperationLessThanOrEqual29.getSymbol();
        boolean boolean31 = coreOperationLessThanOrEqual29.isSymmetric();
        int int32 = coreOperationLessThanOrEqual29.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual29);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual21, expression24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationGreaterThan34);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray36 = coreOperationLessThanOrEqual13.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual8, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression38, expression39);
        java.lang.String str41 = coreOperationLessThanOrEqual40.getSymbol();
        boolean boolean42 = coreOperationLessThanOrEqual40.isSymmetric();
        int int43 = coreOperationLessThanOrEqual40.getPrecedence();
        int int44 = coreOperationLessThanOrEqual40.getPrecedence();
        boolean boolean45 = coreOperationLessThanOrEqual40.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression46 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression47 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression46, expression47);
        java.lang.String str49 = coreOperationLessThanOrEqual48.getSymbol();
        boolean boolean50 = coreOperationLessThanOrEqual48.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression51 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression52 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual53 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression51, expression52);
        org.apache.commons.jxpath.ri.compiler.Expression expression54 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression55 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual56 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression54, expression55);
        java.lang.String str57 = coreOperationLessThanOrEqual56.getSymbol();
        boolean boolean58 = coreOperationLessThanOrEqual56.isSymmetric();
        int int59 = coreOperationLessThanOrEqual56.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan60 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression51, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual56);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan61 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual48, expression51);
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual62 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual40, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationGreaterThan61);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray63 = coreOperationLessThanOrEqual40.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual coreOperationGreaterThanOrEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationGreaterThan37, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<=" + "'", str9, "<=");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<=" + "'", str14, "<=");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<=" + "'", str22, "<=");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<=" + "'", str30, "<=");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(expressionArray36);
        org.junit.Assert.assertArrayEquals(expressionArray36, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<=" + "'", str41, "<=");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<=" + "'", str49, "<=");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<=" + "'", str57, "<=");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertNotNull(expressionArray63);
        org.junit.Assert.assertArrayEquals(expressionArray63, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.jxpath.ri.compiler.Expression expression0 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression1 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual2 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression0, expression1);
        java.lang.String str3 = coreOperationLessThanOrEqual2.getSymbol();
        boolean boolean4 = coreOperationLessThanOrEqual2.isSymmetric();
        int int5 = coreOperationLessThanOrEqual2.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression6 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression7 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual8 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression6, expression7);
        java.lang.String str9 = coreOperationLessThanOrEqual8.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan10 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual2, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual8);
        org.apache.commons.jxpath.ri.compiler.Expression expression11 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression12 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual13 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression11, expression12);
        java.lang.String str14 = coreOperationLessThanOrEqual13.getSymbol();
        boolean boolean15 = coreOperationLessThanOrEqual13.isSymmetric();
        int int16 = coreOperationLessThanOrEqual13.getPrecedence();
        int int17 = coreOperationLessThanOrEqual13.getPrecedence();
        boolean boolean18 = coreOperationLessThanOrEqual13.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression19 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression20 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual21 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression19, expression20);
        java.lang.String str22 = coreOperationLessThanOrEqual21.getSymbol();
        boolean boolean23 = coreOperationLessThanOrEqual21.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression24 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression25 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual26 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression24, expression25);
        org.apache.commons.jxpath.ri.compiler.Expression expression27 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression28 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual29 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression27, expression28);
        java.lang.String str30 = coreOperationLessThanOrEqual29.getSymbol();
        boolean boolean31 = coreOperationLessThanOrEqual29.isSymmetric();
        int int32 = coreOperationLessThanOrEqual29.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan33 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression24, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual29);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan34 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual21, expression24);
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual35 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationGreaterThan34);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray36 = coreOperationLessThanOrEqual13.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan37 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual8, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual13);
        org.apache.commons.jxpath.ri.compiler.Expression expression38 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression39 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual40 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression38, expression39);
        java.lang.String str41 = coreOperationLessThanOrEqual40.getSymbol();
        boolean boolean42 = coreOperationLessThanOrEqual40.isSymmetric();
        int int43 = coreOperationLessThanOrEqual40.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.Expression expression44 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression45 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual46 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression44, expression45);
        java.lang.String str47 = coreOperationLessThanOrEqual46.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan48 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual40, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual46);
        org.apache.commons.jxpath.ri.compiler.Expression expression49 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression50 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual51 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression49, expression50);
        java.lang.String str52 = coreOperationLessThanOrEqual51.getSymbol();
        boolean boolean53 = coreOperationLessThanOrEqual51.isSymmetric();
        int int54 = coreOperationLessThanOrEqual51.getPrecedence();
        int int55 = coreOperationLessThanOrEqual51.getPrecedence();
        boolean boolean56 = coreOperationLessThanOrEqual51.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression57 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression58 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual59 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression57, expression58);
        java.lang.String str60 = coreOperationLessThanOrEqual59.getSymbol();
        boolean boolean61 = coreOperationLessThanOrEqual59.isSymmetric();
        org.apache.commons.jxpath.ri.compiler.Expression expression62 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression63 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual64 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression62, expression63);
        org.apache.commons.jxpath.ri.compiler.Expression expression65 = null;
        org.apache.commons.jxpath.ri.compiler.Expression expression66 = null;
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual67 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual(expression65, expression66);
        java.lang.String str68 = coreOperationLessThanOrEqual67.getSymbol();
        boolean boolean69 = coreOperationLessThanOrEqual67.isSymmetric();
        int int70 = coreOperationLessThanOrEqual67.getPrecedence();
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan coreOperationLessThan71 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan(expression62, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual67);
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan72 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual59, expression62);
        org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual coreOperationLessThanOrEqual73 = new org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual51, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationGreaterThan72);
        org.apache.commons.jxpath.ri.compiler.Expression[] expressionArray74 = coreOperationLessThanOrEqual51.getArguments();
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan75 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual46, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual51);
        java.lang.String str76 = coreOperationLessThanOrEqual51.getSymbol();
        org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan coreOperationGreaterThan77 = new org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan((org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual13, (org.apache.commons.jxpath.ri.compiler.Expression) coreOperationLessThanOrEqual51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<=" + "'", str3, "<=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<=" + "'", str9, "<=");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<=" + "'", str14, "<=");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<=" + "'", str22, "<=");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<=" + "'", str30, "<=");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(expressionArray36);
        org.junit.Assert.assertArrayEquals(expressionArray36, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<=" + "'", str41, "<=");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<=" + "'", str47, "<=");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "<=" + "'", str52, "<=");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "<=" + "'", str60, "<=");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "<=" + "'", str68, "<=");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertNotNull(expressionArray74);
        org.junit.Assert.assertArrayEquals(expressionArray74, new org.apache.commons.jxpath.ri.compiler.Expression[] { null, null });
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "<=" + "'", str76, "<=");
    }
}

