package com.google.javascript.jscomp;

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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph1 = null;
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter2 = null;
        com.google.javascript.jscomp.Scope scope3 = null;
        java.util.Map<java.lang.String, com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.TypeInference typeInference5 = new com.google.javascript.jscomp.TypeInference(abstractCompiler0, nodeControlFlowGraph1, reverseAbstractInterpreter2, scope3, strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = com.google.javascript.jscomp.DataFlowAnalysis.MAX_STEPS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 400000 + "'", int0 == 400000);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.TypedScopeCreator.ENUM_INITIALIZER;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.CodingConvention codingConvention1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.TypedScopeCreator typedScopeCreator2 = new com.google.javascript.jscomp.TypedScopeCreator(abstractCompiler0, codingConvention1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = null;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet0 = null;
        com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.BooleanLiteralSet booleanLiteralSet3 = com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(booleanLiteralSet0, booleanLiteralSet1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String str0 = com.google.javascript.jscomp.TypedScopeCreator.DELEGATE_PROXY_SUFFIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "(Proxy)" + "'", str0, "(Proxy)");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.TypedScopeCreator typedScopeCreator1 = new com.google.javascript.jscomp.TypedScopeCreator(abstractCompiler0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.TypedScopeCreator.UNKNOWN_LENDS;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.TypedScopeCreator.MALFORMED_TYPEDEF;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.TypedScopeCreator.CONSTRUCTOR_EXPECTED;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.TypedScopeCreator.CTOR_INITIALIZER;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.TypedScopeCreator.IFACE_INITIALIZER;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.TypeInference.FUNCTION_LITERAL_UNDEFINED_THIS;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.TypedScopeCreator.LENDS_ON_NON_OBJECT;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

